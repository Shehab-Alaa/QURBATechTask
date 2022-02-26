package com.example.qurbatechtask.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.qurbatechtask.ui.theme.QURBATechTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QURBATechTaskTheme {
                MainScreen()
            }
        }
    }
}