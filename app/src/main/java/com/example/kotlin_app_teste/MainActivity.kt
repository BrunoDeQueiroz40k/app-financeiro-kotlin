package com.example.kotlin_app_teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_app_teste.core.navigation.AppNavigation
import com.example.kotlin_app_teste.feature.welcome.WelcomeScreen
import com.example.kotlin_app_teste.feature.onboarding.OnBoardingScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hideNavigationBar()
        setContent {
            OnBoardingScreen(navController = rememberNavController())
        }
    }

    // Funções para esconder o menu de navegação do celular //////
    override fun onResume() {
        super.onResume()
        hideNavigationBar()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideNavigationBar()
        }
    }

    private fun hideNavigationBar() {
        WindowCompat.getInsetsController(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.navigationBars())
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
    ///////////////////////////////////////////////////////////////
}

@Composable
fun Home() {
    OnBoardingScreen(navController = rememberNavController())
}

@Preview
@Composable
fun PagePreview() {
    OnBoardingScreen(navController = rememberNavController())
}
