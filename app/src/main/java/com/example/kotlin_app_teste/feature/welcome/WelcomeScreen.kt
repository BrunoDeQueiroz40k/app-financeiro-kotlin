package com.example.kotlin_app_teste.feature.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.PieChart
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_app_teste.core.designsystem.component.CustomButton

private val bubbleIconTint = Color(0xFF2563EB)
private val outerCircleShape = RoundedCornerShape(999.dp)

@Composable
private fun FloatingIconBubble(
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

@Composable
private fun WelcomeCard(
    icon: ImageVector,
    title: String,
    contentDescription: String
) {
    Box(
        modifier = Modifier
            .padding(vertical = 10.dp)
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
            modifier = Modifier
                .padding(22.dp),
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

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp, 50.dp, 30.dp, 20.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Surface(
                    onClick = {},
                    modifier = Modifier.size(44.dp),
                    shape = RoundedCornerShape(15.dp),
                    color = Color(0xFFF9FAFB),
                    border = BorderStroke(2.dp, Color(0xFFE0E0E0)),
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBackIosNew,
                            contentDescription = "Voltar",
                            modifier = Modifier.size(20.dp),
                            tint = Color.Black,
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .width(32.dp)
                            .height(8.dp)
                            .clip(outerCircleShape)
                            .background(Color(0xFF2563EB))
                    ) {}
                    Box(
                        modifier = Modifier
                            .width(8.dp)
                            .height(8.dp)
                            .clip(outerCircleShape)
                            .background(Color(0xFFE5E7EB))
                    ) {}
                }
                Text(
                    "Pular",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6B7280)
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Box(
                    modifier = Modifier.size(220.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Box(
                        modifier = Modifier
                            .size(192.dp)
                            .shadow(
                                elevation = 20.dp,
                                shape = outerCircleShape,
                                clip = false,
                                ambientColor = Color(0xFF2563EB).copy(alpha = 0.4f),
                                spotColor = Color.Black.copy(alpha = 0.4f),
                            )
                            .drawBehind {
                                drawCircle(
                                    brush = Brush.linearGradient(
                                        colors = listOf(
                                            Color(0xFFF1F7FF),
                                            Color(0xFFF3F7FB),
                                            Color.White,
                                        ),
                                        start = Offset.Zero,
                                        end = Offset(size.width, size.height),
                                    ),
                                    radius = size.minDimension / 2f,
                                )
                            }
                            .border(
                                width = 2.dp,
                                color = Color(0xFFDBEAFE),
                                shape = outerCircleShape,
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        Box(
                            modifier = Modifier
                                .size(128.dp)
                                .background(Color.White, RoundedCornerShape(999.dp))
                                .border(
                                    width = 2.dp,
                                    color = Color(0xFFFBFBFB),
                                    shape = RoundedCornerShape(999.dp),
                                ),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                modifier = Modifier.size(80.dp),
                                imageVector = Icons.Filled.PieChart,
                                contentDescription = "Gráfico",
                                tint = bubbleIconTint,
                            )
                        }
                    }

                    FloatingIconBubble(
                        icon = Icons.Filled.TrendingUp,
                        contentDescription = "Tendência",
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .offset(x = 2.dp, y = 18.dp),
                    )

                    FloatingIconBubble(
                        icon = Icons.Filled.AccountBalanceWallet,
                        contentDescription = "Carteira",
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(x = 2.dp, y = (-18).dp),
                    )
                }
                Text(
                    "Controle Total",
                    modifier = Modifier.padding(0.dp, 26.dp, 0.dp, 10.dp),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "Assuma o controle do seu dinheiro. Acompanhe gastos, crie metas e alcance sua liberdade financeira.",
                    modifier = Modifier.width(240.dp).padding(bottom = 30.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp
                )
                WelcomeCard(
                    icon = Icons.Filled.Checklist,
                    title = "Organização Simples",
                    contentDescription = "Categorize seus gastos automaticamente"
                )
                WelcomeCard(
                    icon = Icons.Filled.Checklist,
                    title = "Visão Clara",
                    contentDescription = "Gráficos intuitivos para entender seu dinheiro"
                )
            }
            CustomButton(
                icon = Icons.Filled.ArrowForward,
                text = "Próximo passo"
            ) { }
        }
    }
}
