package com.example.kotlin_app_teste.core.designsystem.component.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_app_teste.feature.welcome.bubbleIconTint

@Composable
fun WelcomeCard(
    icon: ImageVector,
    title: String,
    contentDescription: String
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(Color(0xFFF9FAFB))
            .border(
                width = 2.dp,
                color = Color(0xFFE0E0E0),
                shape = RoundedCornerShape(25.dp),
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.padding(22.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                shape = RoundedCornerShape(15.dp),
                color = Color(0xFFF9FAFB),
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    modifier = Modifier
                        .background(Color.White)
                        .padding(12.dp)
                        .size(32.dp),
                    tint = bubbleIconTint
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    contentDescription,
                    fontSize = 16.sp,
                    color = Color(0xFF6B7280)
                )
            }
        }
    }
}
