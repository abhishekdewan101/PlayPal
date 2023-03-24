package com.adewan.playpal.ux.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ChangeSystemUiEffect(statusBarColor: Color, navigationBarColor: Color) {
    val uiController = rememberSystemUiController()

    DisposableEffect(key1 = statusBarColor, key2 = navigationBarColor) {
        uiController.setStatusBarColor(color = statusBarColor)
        uiController.setNavigationBarColor(color = navigationBarColor)
        onDispose { }
    }
}
