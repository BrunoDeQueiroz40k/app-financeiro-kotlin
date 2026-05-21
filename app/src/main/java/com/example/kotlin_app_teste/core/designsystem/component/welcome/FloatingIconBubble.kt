package com.example.kotlin_app_teste.core.designsystem.component.welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.kotlin_app_teste.feature.welcome.bubbleIconTint

@Composable
fun FloatingIconBubble(
    icon: ImageVector,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.size(52.dp),
        shape = CircleShape,
        color = Color.White,
        shadowElevation = 5.dp,
        tonalElevation = 0.dp,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                modifier = Modifier.size(26.dp),
                tint = bubbleIconTint,
            )
        }
    }
}