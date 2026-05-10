package com.example.mynolduaapp

import androidx.compose.ui.window.ComposeUIViewController
import com.example.mynolduaapp.app.App
import com.example.mynolduaapp.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}