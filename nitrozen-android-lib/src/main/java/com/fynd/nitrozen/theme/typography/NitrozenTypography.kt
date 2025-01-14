package com.fynd.nitrozen.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.fynd.nitrozen.R

@OptIn(ExperimentalTextApi::class)
@Immutable
data class NitrozenTypography(
    val bodyXsReg: TextStyle,
    val bodyXsBold: TextStyle,
    val bodyXxsReg: TextStyle,
    val bodyXsLink: TextStyle,
    val bodySmall: TextStyle,
    val bodySmallRegular: TextStyle,
    val bodySmallBold: TextStyle,
    val bodyMediumBold: TextStyle,
    val headingXs: TextStyle,
    val headingXxs: TextStyle,
    val bodyLBold: TextStyle,
) {
    companion object {
        @Composable
        fun getDefault(): TextStyle {
            return TextStyle.Default.copy(
                fontSize = 14.sp,
                fontFamily = fontsNitrozen,
                fontWeight = FontWeight.Medium,
                platformStyle = PlatformTextStyle(includeFontPadding = false),
                color = colorResource(id = R.color.grey100)
            )
        }
    }
}

val LocalNitrozenTypography = staticCompositionLocalOf {
    NitrozenTypography(
        bodyXsReg = TextStyle.Default,
        bodyXsBold = TextStyle.Default,
        bodyXxsReg = TextStyle.Default,
        bodyXsLink = TextStyle.Default,
        bodySmall = TextStyle.Default,
        bodySmallRegular = TextStyle.Default,
        bodySmallBold = TextStyle.Default,
        bodyMediumBold = TextStyle.Default,
        headingXs = TextStyle.Default,
        headingXxs = TextStyle.Default,
        bodyLBold = TextStyle.Default
    )
}
