package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .shadow(
                elevation = 20.dp,
                shape = RoundedCornerShape(
                    0.dp,
                    0.dp,
                    40.dp,
                    40.dp,
                ),
                clip = false,
                ambientColor = Color.Black.copy(alpha = 15f),
                spotColor = Color.Black.copy(alpha = 2f),
            )
            .drawBehind {
                drawOutline(
                    outline = RoundedCornerShape(
                        0.dp,
                        0.dp,
                        40.dp,
                        40.dp,
                    ).createOutline(size, layoutDirection, this),
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF153D99),
                            Color(0xFF2A68ED),
                            Color(0xFF5B93F5),
                        ),
                        start = Offset.Zero,
                        end = Offset(size.width, size.height),
                    ),
                )
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color.White,
                    RoundedCornerShape(20.dp),
                )
                .padding(16.dp)
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                tint = Color(0xFF2563EB)
            )
        }
        Text(
            "Bem-vindo de volta",
            modifier = Modifier
                .padding(0.dp, 25.dp, 0.dp, 0.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            "Acesse sua conta para continuar controlando suas finanças.",
            modifier = Modifier
                .widthIn(max = 220.dp)
                .padding(0.dp, 8.dp, 0.dp, 0.dp),
            textAlign = TextAlign.Center,
            color = Color.White
        )
    }
}