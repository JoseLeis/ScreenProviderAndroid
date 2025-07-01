package com.joseleis.components.foundation.dimensions

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Material 3 Dimensions System
 * 
 * Based on Material 3 specifications for spacing, sizing, and other dimensions.
 * https://m3.material.io/foundations/layout/spacing
 */
object Dimensions {
    /**
     * Spacing system - Used for margins, padding, and gaps
     */
    object Spacing {
        // Base spacing units
        val none = 0.dp
        val extraSmall = 4.dp
        val small = 8.dp
        val medium = 16.dp
        val large = 24.dp
        val extraLarge = 32.dp
        val xxLarge = 40.dp
        val xxxLarge = 48.dp
        val huge = 56.dp
        val extraHuge = 64.dp
        
        // Component specific spacing
        object Layout {
            val screenPadding = medium
            val contentPadding = medium
            val sectionSpacing = large
            val itemSpacing = small
        }
        
        // Component specific padding
        object Component {
            val buttonPadding = small
            val buttonContentPadding = medium
            val cardPadding = medium
            val chipPadding = small
            val dialogPadding = large
            val inputPadding = medium
            val listItemPadding = medium
            val sheetPadding = large
            val tooltipPadding = small
        }
        
        // Grid system
        object Grid {
            val gridGutter = medium
            val gridMargin = medium
        }
    }
    
    /**
     * Size system - Used for component dimensions
     */
    object Size {
        // Base sizing units for components
        val minTouchTarget = 48.dp  // Minimum touch target size
        
        // Icon sizes
        object Icon {
            val small = 16.dp
            val medium = 24.dp
            val large = 32.dp
            val extraLarge = 48.dp
        }
        
        // Button heights
        object Button {
            val small = 32.dp
            val medium = 40.dp
            val large = 48.dp
            val extraLarge = 56.dp
            
            // FAB sizes
            object Fab {
                val small = 40.dp
                val normal = 56.dp
                val large = 96.dp
            }
        }
        
        // Avatar/Profile picture sizes
        object Avatar {
            val small = 24.dp
            val medium = 40.dp
            val large = 56.dp
            val extraLarge = 80.dp
        }
        
        // Form elements
        object Input {
            val height = 56.dp
            val smallHeight = 48.dp
            val borderWidth = 1.dp
            val focusedBorderWidth = 2.dp
            val cornerRadius = 4.dp
        }
        
        // Dividers
        object Divider {
            val thickness = 1.dp
            val thicknessBold = 2.dp
        }
        
        // Cards
        object Card {
            val defaultElevation = 1.dp
            val raisedElevation = 4.dp
            val cornerRadius = 16.dp
        }
        
        // Chips
        object Chip {
            val height = 32.dp
            val cornerRadius = 16.dp
        }
    }
    
    /**
     * Elevation system - Used for component elevations
     */
    object Elevation {
        val level0 = 0.dp
        val level1 = 1.dp
        val level2 = 3.dp
        val level3 = 6.dp
        val level4 = 8.dp
        val level5 = 12.dp
        
        // Component specific elevations
        val card = level1
        val cardRaised = level2
        val dialog = level3
        val drawer = level1
        val fab = level3
        val menu = level2
        val modalSheet = level3
        val searchBar = level2
        val snackbar = level3
        val switch = level1
        val tooltip = level2
    }
    
    /**
     * Shape system - Used for component corner radiuses
     */
    object Shape {
        val none = 0.dp
        val extraSmall = 4.dp
        val small = 8.dp
        val medium = 12.dp
        val large = 16.dp
        val extraLarge = 24.dp
        val full = 9999.dp  // Used for fully circular elements
    }
    
    /**
     * Typography scale - Font sizes from Material 3 type scale
     * Note: This complements the Typography.kt file
     */
    object TypeScale {
        // Display sizes
        val displayLarge = 57.sp
        val displayMedium = 45.sp
        val displaySmall = 36.sp
        
        // Headline sizes
        val headlineLarge = 32.sp
        val headlineMedium = 28.sp
        val headlineSmall = 24.sp
        
        // Title sizes
        val titleLarge = 22.sp
        val titleMedium = 16.sp
        val titleSmall = 14.sp
        
        // Body sizes
        val bodyLarge = 16.sp
        val bodyMedium = 14.sp
        val bodySmall = 12.sp
        
        // Label sizes
        val labelLarge = 14.sp
        val labelMedium = 12.sp
        val labelSmall = 11.sp
    }
    
    /**
     * Animation timings
     */
    object AnimationDuration {
        const val short = 150
        const val medium = 250
        const val long = 350
        const val extraLong = 500
    }
}