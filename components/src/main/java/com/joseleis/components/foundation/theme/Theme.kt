package com.joseleis.components.foundation.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.compose.foundation.shape.RoundedCornerShape
import com.joseleis.components.foundation.color.DarkColorScheme
import com.joseleis.components.foundation.color.ExtendedColorScheme
import com.joseleis.components.foundation.color.LightColorScheme
import com.joseleis.components.foundation.dimensions.Dimensions
import com.joseleis.components.foundation.typography.ComponentTypography

/**
 * Custom LocalCompositionLocal for dimensions to make them accessible throughout the app
 */
val LocalDimensions = staticCompositionLocalOf { Dimensions }

/**
 * Custom LocalCompositionLocal for extended colors not in Material3 ColorScheme
 */
val LocalExtendedColorScheme = staticCompositionLocalOf { ExtendedColorScheme }

/**
 * Material 3 shape definitions
 */
val ComponentShapes = Shapes(
    extraSmall = RoundedCornerShape(Dimensions.Shape.extraSmall),
    small = RoundedCornerShape(Dimensions.Shape.small),
    medium = RoundedCornerShape(Dimensions.Shape.medium),
    large = RoundedCornerShape(Dimensions.Shape.large),
    extraLarge = RoundedCornerShape(Dimensions.Shape.extraLarge)
)

/**
 * Main theme composable for the component library
 */
@Composable
fun ComponentTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    
    // Determine the color scheme to use
    val colorScheme = when {
        // Use dynamic colors on Android 12+ when enabled
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        // Otherwise use our predefined color schemes
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    // Set the status bar color
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.surface.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }
    
    // Provide all the theme components through CompositionLocalProvider
    CompositionLocalProvider(
        LocalDimensions provides Dimensions,
        LocalExtendedColorScheme provides ExtendedColorScheme,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = ComponentTypography.createTypography(),
            shapes = ComponentShapes,
            content = content
        )
    }
}
