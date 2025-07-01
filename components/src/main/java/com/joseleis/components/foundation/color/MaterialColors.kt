package com.joseleis.components.foundation.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Material 3 Color System
 *
 * Based on Material 3 specifications for dynamic color.
 * https://m3.material.io/styles/color/the-color-system/key-colors-tones
 */
object MaterialColors {
    /**
     * Primary Color Palette - Used for key components across the UI
     */
    object Primary {
        // Light Theme
        val Primary0 = Color(0xFF000000)
        val Primary10 = Color(0xFF001d33)
        val Primary20 = Color(0xFF003355)
        val Primary30 = Color(0xFF004c7a)
        val Primary40 = Color(0xFF0063a0)
        val Primary50 = Color(0xFF007cc7)
        val Primary60 = Color(0xFF0097ee)
        val Primary70 = Color(0xFF4fb4ff)
        val Primary80 = Color(0xFF8ccdff)
        val Primary90 = Color(0xFFcee5ff)
        val Primary95 = Color(0xFFe7f2ff)
        val Primary99 = Color(0xFFfcfdff)
        val Primary100 = Color(0xFFFFFFFF)
        
        // Default color for light theme
        val Default = Primary40
        val OnDefault = Color.White
        val DefaultContainer = Primary90
        val OnDefaultContainer = Primary10
    }
    
    /**
     * Secondary Color Palette - Used for less prominent components
     */
    object Secondary {
        // Light Theme
        val Secondary0 = Color(0xFF000000)
        val Secondary10 = Color(0xFF0f1d2a)
        val Secondary20 = Color(0xFF253240)
        val Secondary30 = Color(0xFF3b4857)
        val Secondary40 = Color(0xFF52606f)
        val Secondary50 = Color(0xFF6a7988)
        val Secondary60 = Color(0xFF8392a2)
        val Secondary70 = Color(0xFF9dadbc)
        val Secondary80 = Color(0xFFb7c8d8)
        val Secondary90 = Color(0xFFd3e4f4)
        val Secondary95 = Color(0xFFe9f2fa)
        val Secondary99 = Color(0xFFfbfcff)
        val Secondary100 = Color(0xFFFFFFFF)
        
        // Default color for light theme
        val Default = Secondary40
        val OnDefault = Color.White
        val DefaultContainer = Secondary90
        val OnDefaultContainer = Secondary10
    }
    
    /**
     * Tertiary Color Palette - Used for contrast and accents
     */
    object Tertiary {
        // Light Theme
        val Tertiary0 = Color(0xFF000000)
        val Tertiary10 = Color(0xFF2b0e1e)
        val Tertiary20 = Color(0xFF421933)
        val Tertiary30 = Color(0xFF5b2549)
        val Tertiary40 = Color(0xFF75325f)
        val Tertiary50 = Color(0xFF903e77)
        val Tertiary60 = Color(0xFFab4b90)
        val Tertiary70 = Color(0xFFc767aa)
        val Tertiary80 = Color(0xFFe384c6)
        val Tertiary90 = Color(0xFFffa9e1)
        val Tertiary95 = Color(0xFFffd8ee)
        val Tertiary99 = Color(0xFFfcf8f9)
        val Tertiary100 = Color(0xFFFFFFFF)
        
        // Default color for light theme
        val Default = Tertiary40
        val OnDefault = Color.White
        val DefaultContainer = Tertiary90
        val OnDefaultContainer = Tertiary10
    }
    
    /**
     * Error Color Palette - Used for errors and destructive actions
     */
    object Error {
        val Error0 = Color(0xFF000000)
        val Error10 = Color(0xFF410002)
        val Error20 = Color(0xFF690005)
        val Error30 = Color(0xFF93000a)
        val Error40 = Color(0xFFba1a1a)
        val Error50 = Color(0xFFde3730)
        val Error60 = Color(0xFFff5449)
        val Error70 = Color(0xFFff897d)
        val Error80 = Color(0xFFffb4ab)
        val Error90 = Color(0xFFffdad6)
        val Error95 = Color(0xFFffedea)
        val Error99 = Color(0xFFfffbff)
        val Error100 = Color(0xFFFFFFFF)
        
        val Default = Error40
        val OnDefault = Color.White
        val DefaultContainer = Error90
        val OnDefaultContainer = Error10
    }
    
    /**
     * Neutral (Gray) Color Palette - Used for backgrounds, surfaces and components
     */
    object Neutral {
        val Neutral0 = Color(0xFF000000)
        val Neutral10 = Color(0xFF191c1d)
        val Neutral20 = Color(0xFF2e3132)
        val Neutral30 = Color(0xFF454748)
        val Neutral40 = Color(0xFF5c5f60)
        val Neutral50 = Color(0xFF757778)
        val Neutral60 = Color(0xFF8e9091)
        val Neutral70 = Color(0xFFa9abac)
        val Neutral80 = Color(0xFFc4c7c7)
        val Neutral90 = Color(0xFFe0e3e3)
        val Neutral95 = Color(0xFFeff1f1)
        val Neutral99 = Color(0xFFfafdfd)
        val Neutral100 = Color(0xFFFFFFFF)
    }
    
    /**
     * Neutral Variant Color Palette - Used for subtle UI elements
     */
    object NeutralVariant {
        val NeutralVariant0 = Color(0xFF000000)
        val NeutralVariant10 = Color(0xFF181c22)
        val NeutralVariant20 = Color(0xFF2c3038)
        val NeutralVariant30 = Color(0xFF43474f)
        val NeutralVariant40 = Color(0xFF5a5e67)
        val NeutralVariant50 = Color(0xFF72767f)
        val NeutralVariant60 = Color(0xFF8b8f99)
        val NeutralVariant70 = Color(0xFFa5a9b3)
        val NeutralVariant80 = Color(0xFFc0c4cd)
        val NeutralVariant90 = Color(0xFFdce0e9)
        val NeutralVariant95 = Color(0xFFebeff7)
        val NeutralVariant99 = Color(0xFFfcfcff)
        val NeutralVariant100 = Color(0xFFFFFFFF)
    }
    
    /**
     * Surface tint and shadow colors
     */
    object Surface {
        val SurfaceTint = Primary.Primary40
        
        val ShadowLight = Color(0x66000000) // 40% opacity black
        val ShadowDark = Color(0x66000000)  // 40% opacity black
    }
    
    /**
     * System UI colors (status bar, etc)
     */
    object System {
        val SystemBar = Neutral.Neutral90
        val SystemBarDark = Neutral.Neutral10
    }
    
    /**
     * Status colors
     */
    object Status {
        val Success = Color(0xFF146C2E)
        val OnSuccess = Color.White
        val SuccessContainer = Color(0xFFA1F4B5)
        val OnSuccessContainer = Color(0xFF002107)
        
        val Warning = Color(0xFF8B5000)
        val OnWarning = Color.White
        val WarningContainer = Color(0xFFFFDCBA)
        val OnWarningContainer = Color(0xFF2C1600)
        
        val Info = Color(0xFF0062A1)
        val OnInfo = Color.White
        val InfoContainer = Color(0xFFD1E4FF)
        val OnInfoContainer = Color(0xFF001D36)
    }
}

/**
 * Material 3 Light Color Scheme
 */
val LightColorScheme = lightColorScheme(
    // Primary colors
    primary = MaterialColors.Primary.Default,
    onPrimary = MaterialColors.Primary.OnDefault,
    primaryContainer = MaterialColors.Primary.DefaultContainer,
    onPrimaryContainer = MaterialColors.Primary.OnDefaultContainer,
    
    // Secondary colors
    secondary = MaterialColors.Secondary.Default,
    onSecondary = MaterialColors.Secondary.OnDefault,
    secondaryContainer = MaterialColors.Secondary.DefaultContainer,
    onSecondaryContainer = MaterialColors.Secondary.OnDefaultContainer,
    
    // Tertiary colors
    tertiary = MaterialColors.Tertiary.Default,
    onTertiary = MaterialColors.Tertiary.OnDefault,
    tertiaryContainer = MaterialColors.Tertiary.DefaultContainer,
    onTertiaryContainer = MaterialColors.Tertiary.OnDefaultContainer,
    
    // Error colors
    error = MaterialColors.Error.Default,
    onError = MaterialColors.Error.OnDefault,
    errorContainer = MaterialColors.Error.DefaultContainer,
    onErrorContainer = MaterialColors.Error.OnDefaultContainer,
    
    // Background colors
    background = MaterialColors.Neutral.Neutral99,
    onBackground = MaterialColors.Neutral.Neutral10,
    
    // Surface colors
    surface = MaterialColors.Neutral.Neutral99,
    onSurface = MaterialColors.Neutral.Neutral10,
    surfaceVariant = MaterialColors.NeutralVariant.NeutralVariant90,
    onSurfaceVariant = MaterialColors.NeutralVariant.NeutralVariant30,
    surfaceTint = MaterialColors.Surface.SurfaceTint,
    
    // Outline colors
    outline = MaterialColors.NeutralVariant.NeutralVariant50,
    outlineVariant = MaterialColors.NeutralVariant.NeutralVariant80,
    
    // Inverse colors
    inverseSurface = MaterialColors.Neutral.Neutral20,
    inverseOnSurface = MaterialColors.Neutral.Neutral95,
    inversePrimary = MaterialColors.Primary.Primary80,
    
    // Scrim
    scrim = MaterialColors.Neutral.Neutral0
)

/**
 * Material 3 Dark Color Scheme
 */
val DarkColorScheme = darkColorScheme(
    // Primary colors
    primary = MaterialColors.Primary.Primary80,
    onPrimary = MaterialColors.Primary.Primary20,
    primaryContainer = MaterialColors.Primary.Primary30,
    onPrimaryContainer = MaterialColors.Primary.Primary90,
    
    // Secondary colors
    secondary = MaterialColors.Secondary.Secondary80,
    onSecondary = MaterialColors.Secondary.Secondary20,
    secondaryContainer = MaterialColors.Secondary.Secondary30,
    onSecondaryContainer = MaterialColors.Secondary.Secondary90,
    
    // Tertiary colors
    tertiary = MaterialColors.Tertiary.Tertiary80,
    onTertiary = MaterialColors.Tertiary.Tertiary20,
    tertiaryContainer = MaterialColors.Tertiary.Tertiary30,
    onTertiaryContainer = MaterialColors.Tertiary.Tertiary90,
    
    // Error colors
    error = MaterialColors.Error.Error80,
    onError = MaterialColors.Error.Error20,
    errorContainer = MaterialColors.Error.Error30,
    onErrorContainer = MaterialColors.Error.Error90,
    
    // Background colors
    background = MaterialColors.Neutral.Neutral10,
    onBackground = MaterialColors.Neutral.Neutral90,
    
    // Surface colors
    surface = MaterialColors.Neutral.Neutral10,
    onSurface = MaterialColors.Neutral.Neutral90,
    surfaceVariant = MaterialColors.NeutralVariant.NeutralVariant30,
    onSurfaceVariant = MaterialColors.NeutralVariant.NeutralVariant80,
    surfaceTint = MaterialColors.Primary.Primary80,
    
    // Outline colors
    outline = MaterialColors.NeutralVariant.NeutralVariant60,
    outlineVariant = MaterialColors.NeutralVariant.NeutralVariant30,
    
    // Inverse colors
    inverseSurface = MaterialColors.Neutral.Neutral90,
    inverseOnSurface = MaterialColors.Neutral.Neutral20,
    inversePrimary = MaterialColors.Primary.Primary40,
    
    // Scrim
    scrim = MaterialColors.Neutral.Neutral0
)

/**
 * Extended color schemes for additional colors not in Material 3 ColorScheme
 */
object ExtendedColorScheme {
    // Success colors
    val success = MaterialColors.Status.Success
    val onSuccess = MaterialColors.Status.OnSuccess
    val successContainer = MaterialColors.Status.SuccessContainer
    val onSuccessContainer = MaterialColors.Status.OnSuccessContainer
    
    // Warning colors
    val warning = MaterialColors.Status.Warning
    val onWarning = MaterialColors.Status.OnWarning
    val warningContainer = MaterialColors.Status.WarningContainer
    val onWarningContainer = MaterialColors.Status.OnWarningContainer
    
    // Info colors
    val info = MaterialColors.Status.Info
    val onInfo = MaterialColors.Status.OnInfo
    val infoContainer = MaterialColors.Status.InfoContainer
    val onInfoContainer = MaterialColors.Status.OnInfoContainer
    
    // System bar colors
    val systemBar = MaterialColors.System.SystemBar
    val systemBarDark = MaterialColors.System.SystemBarDark
}