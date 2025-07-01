package com.joseleis.components.foundation.typography

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.joseleis.components.R

/**
 * Roboto font family with all weight and style variants
 * Following Material 3 specifications
 */
val Roboto = FontFamily(
    // Thin variants (weight 100)
    Font(R.font.roboto_thin, FontWeight.Thin, FontStyle.Normal),
    Font(R.font.roboto_thin_italic, FontWeight.Thin, FontStyle.Italic),

    // Light variants (weight 300)
    Font(R.font.roboto_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.roboto_light_italic, FontWeight.Light, FontStyle.Italic),

    // Regular variants (weight 400)
    Font(R.font.roboto_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),

    // Medium variants (weight 500)
    Font(R.font.roboto_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.roboto_medium_italic, FontWeight.Medium, FontStyle.Italic),

    // Semi-Bold variants (weight 600)
    Font(R.font.roboto_semi_bold, FontWeight.SemiBold, FontStyle.Normal),
    Font(R.font.roboto_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),

    // Bold variants (weight 700)
    Font(R.font.roboto_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.roboto_bold_italic, FontWeight.Bold, FontStyle.Italic),

    // Black variants (weight 900)
    Font(R.font.roboto_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.roboto_black_italic, FontWeight.Black, FontStyle.Italic)
)

/**
 * Material 3 Typography System with Roboto font variants
 *
 * This typography system follows Material 3 specifications and provides
 * multiple weight and style variants for each text style.
 */
object ComponentTypography {

    // The default FontFamily for the typography system
    val defaultFontFamily = Roboto

    /**
     * Creates a TextStyle variant with specified weight and style
     * Based on an existing TextStyle
     */
    private fun TextStyle.withVariant(
        fontWeight: FontWeight? = null,
        fontStyle: FontStyle? = null
    ): TextStyle = this.copy(
        fontWeight = fontWeight ?: this.fontWeight,
        fontStyle = fontStyle ?: this.fontStyle
    )

    // Base Display styles
    val displayLarge = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    )

    val displayMedium = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    )

    val displaySmall = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    )

    // Base Headline styles
    val headlineLarge = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    )

    val headlineMedium = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    )

    val headlineSmall = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    )

    // Base Title styles
    val titleLarge = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    )

    val titleMedium = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    )

    val titleSmall = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )

    // Base Body styles
    val bodyLarge = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    val bodyMedium = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    )

    val bodySmall = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    )

    // Base Label styles
    val labelLarge = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )

    val labelMedium = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

    val labelSmall = TextStyle(
        fontFamily = defaultFontFamily,
        fontWeight = FontWeight.Medium,
        fontStyle = FontStyle.Normal,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

    // Display style variants
    object Display {
        object Large {
            val Regular = displayLarge
            val Medium = displayLarge.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = displayLarge.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = displayLarge.withVariant(fontWeight = FontWeight.Bold)
            val Light = displayLarge.withVariant(fontWeight = FontWeight.Light)

            val Italic = displayLarge.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = displayLarge.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = displayLarge.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = displayLarge.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = displayLarge.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Medium {
            val Regular = displayMedium
            val Medium = displayMedium.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = displayMedium.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = displayMedium.withVariant(fontWeight = FontWeight.Bold)
            val Light = displayMedium.withVariant(fontWeight = FontWeight.Light)

            val Italic = displayMedium.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = displayMedium.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = displayMedium.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = displayMedium.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = displayMedium.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Small {
            val Regular = displaySmall
            val Medium = displaySmall.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = displaySmall.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = displaySmall.withVariant(fontWeight = FontWeight.Bold)
            val Light = displaySmall.withVariant(fontWeight = FontWeight.Light)

            val Italic = displaySmall.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = displaySmall.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = displaySmall.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = displaySmall.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = displaySmall.withVariant(FontWeight.Light, FontStyle.Italic)
        }
    }

    // Headline style variants
    object Headline {
        object Large {
            val Regular = headlineLarge
            val Medium = headlineLarge.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = headlineLarge.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = headlineLarge.withVariant(fontWeight = FontWeight.Bold)
            val Light = headlineLarge.withVariant(fontWeight = FontWeight.Light)

            val Italic = headlineLarge.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = headlineLarge.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = headlineLarge.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = headlineLarge.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = headlineLarge.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Medium {
            val Regular = headlineMedium
            val Medium = headlineMedium.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = headlineMedium.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = headlineMedium.withVariant(fontWeight = FontWeight.Bold)
            val Light = headlineMedium.withVariant(fontWeight = FontWeight.Light)

            val Italic = headlineMedium.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = headlineMedium.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = headlineMedium.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = headlineMedium.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = headlineMedium.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Small {
            val Regular = headlineSmall
            val Medium = headlineSmall.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = headlineSmall.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = headlineSmall.withVariant(fontWeight = FontWeight.Bold)
            val Light = headlineSmall.withVariant(fontWeight = FontWeight.Light)

            val Italic = headlineSmall.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = headlineSmall.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = headlineSmall.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = headlineSmall.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = headlineSmall.withVariant(FontWeight.Light, FontStyle.Italic)
        }
    }

    // Title style variants
    object Title {
        object Large {
            val Regular = titleLarge
            val Medium = titleLarge.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = titleLarge.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = titleLarge.withVariant(fontWeight = FontWeight.Bold)
            val Light = titleLarge.withVariant(fontWeight = FontWeight.Light)

            val Italic = titleLarge.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = titleLarge.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = titleLarge.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = titleLarge.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = titleLarge.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Medium {
            val Regular = titleMedium.withVariant(fontWeight = FontWeight.Normal)
            val Medium = titleMedium
            val SemiBold = titleMedium.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = titleMedium.withVariant(fontWeight = FontWeight.Bold)
            val Light = titleMedium.withVariant(fontWeight = FontWeight.Light)

            val Italic = titleMedium.withVariant(fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic)
            val MediumItalic = titleMedium.withVariant(fontStyle = FontStyle.Italic)
            val SemiBoldItalic = titleMedium.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = titleMedium.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = titleMedium.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Small {
            val Regular = titleSmall.withVariant(fontWeight = FontWeight.Normal)
            val Medium = titleSmall
            val SemiBold = titleSmall.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = titleSmall.withVariant(fontWeight = FontWeight.Bold)
            val Light = titleSmall.withVariant(fontWeight = FontWeight.Light)

            val Italic = titleSmall.withVariant(fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic)
            val MediumItalic = titleSmall.withVariant(fontStyle = FontStyle.Italic)
            val SemiBoldItalic = titleSmall.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = titleSmall.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = titleSmall.withVariant(FontWeight.Light, FontStyle.Italic)
        }
    }

    // Body style variants
    object Body {
        object Large {
            val Regular = bodyLarge
            val Medium = bodyLarge.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = bodyLarge.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = bodyLarge.withVariant(fontWeight = FontWeight.Bold)
            val Light = bodyLarge.withVariant(fontWeight = FontWeight.Light)

            val Italic = bodyLarge.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = bodyLarge.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = bodyLarge.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = bodyLarge.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = bodyLarge.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Medium {
            val Regular = bodyMedium
            val Medium = bodyMedium.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = bodyMedium.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = bodyMedium.withVariant(fontWeight = FontWeight.Bold)
            val Light = bodyMedium.withVariant(fontWeight = FontWeight.Light)

            val Italic = bodyMedium.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = bodyMedium.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = bodyMedium.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = bodyMedium.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = bodyMedium.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Small {
            val Regular = bodySmall
            val Medium = bodySmall.withVariant(fontWeight = FontWeight.Medium)
            val SemiBold = bodySmall.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = bodySmall.withVariant(fontWeight = FontWeight.Bold)
            val Light = bodySmall.withVariant(fontWeight = FontWeight.Light)

            val Italic = bodySmall.withVariant(fontStyle = FontStyle.Italic)
            val MediumItalic = bodySmall.withVariant(FontWeight.Medium, FontStyle.Italic)
            val SemiBoldItalic = bodySmall.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = bodySmall.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = bodySmall.withVariant(FontWeight.Light, FontStyle.Italic)
        }
    }

    // Label style variants
    object Label {
        object Large {
            val Regular = labelLarge.withVariant(fontWeight = FontWeight.Normal)
            val Medium = labelLarge
            val SemiBold = labelLarge.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = labelLarge.withVariant(fontWeight = FontWeight.Bold)
            val Light = labelLarge.withVariant(fontWeight = FontWeight.Light)

            val Italic = labelLarge.withVariant(fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic)
            val MediumItalic = labelLarge.withVariant(fontStyle = FontStyle.Italic)
            val SemiBoldItalic = labelLarge.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = labelLarge.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = labelLarge.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Medium {
            val Regular = labelMedium.withVariant(fontWeight = FontWeight.Normal)
            val Medium = labelMedium
            val SemiBold = labelMedium.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = labelMedium.withVariant(fontWeight = FontWeight.Bold)
            val Light = labelMedium.withVariant(fontWeight = FontWeight.Light)

            val Italic = labelMedium.withVariant(fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic)
            val MediumItalic = labelMedium.withVariant(fontStyle = FontStyle.Italic)
            val SemiBoldItalic = labelMedium.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = labelMedium.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = labelMedium.withVariant(FontWeight.Light, FontStyle.Italic)
        }

        object Small {
            val Regular = labelSmall.withVariant(fontWeight = FontWeight.Normal)
            val Medium = labelSmall
            val SemiBold = labelSmall.withVariant(fontWeight = FontWeight.SemiBold)
            val Bold = labelSmall.withVariant(fontWeight = FontWeight.Bold)
            val Light = labelSmall.withVariant(fontWeight = FontWeight.Light)

            val Italic = labelSmall.withVariant(fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic)
            val MediumItalic = labelSmall.withVariant(fontStyle = FontStyle.Italic)
            val SemiBoldItalic = labelSmall.withVariant(FontWeight.SemiBold, FontStyle.Italic)
            val BoldItalic = labelSmall.withVariant(FontWeight.Bold, FontStyle.Italic)
            val LightItalic = labelSmall.withVariant(FontWeight.Light, FontStyle.Italic)
        }
    }

    /**
     * Create a complete Material 3 Typography instance
     * Use this to apply typography to your MaterialTheme
     */
    fun createTypography(): Typography = Typography(
        displayLarge = displayLarge,
        displayMedium = displayMedium,
        displaySmall = displaySmall,
        headlineLarge = headlineLarge,
        headlineMedium = headlineMedium,
        headlineSmall = headlineSmall,
        titleLarge = titleLarge,
        titleMedium = titleMedium,
        titleSmall = titleSmall,
        bodyLarge = bodyLarge,
        bodyMedium = bodyMedium,
        bodySmall = bodySmall,
        labelLarge = labelLarge,
        labelMedium = labelMedium,
        labelSmall = labelSmall
    )
}
