package com.example.kotlin_app_teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_app_teste.core.navigation.AppNavigation
import com.example.kotlin_app_teste.feature.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WelcomeScreen()
        }
    }
}

@Composable
fun Home() {
    AppNavigation()
}

//@Preview
//@Composable
//fun PagePreview() {
//    Home()
//}

@Preview
@Composable
fun PagePreview() {
    WelcomeScreen()
}
