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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import components.ui.CustomButton
import com.example.kotlin_app_teste.core.designsystem.component.welcome.FloatingIconBubble
import com.example.kotlin_app_teste.core.designsystem.component.welcome.WelcomeCard
private val outerCircleShape = RoundedCornerShape(999.dp)
val bubbleIconTint = Color(0xFF2563EB)

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(modifier = Modifier.background(Color.White)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp, 30.dp, 30.dp, 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Surface(
                    onClick = { navController.popBackStack() },
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
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
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
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(18.dp),
            ) {
                    Box(
                        modifier = Modifier.size(220.dp).padding(top = 20.dp),
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
                    Column(
                        modifier = Modifier.padding(bottom = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            "Controle Total",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            "Assuma o controle do seu dinheiro. Acompanhe gastos, crie metas e alcance sua liberdade financeira.",
                            modifier = Modifier.width(240.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 15.sp
                        )
                    }
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
                Box(modifier = Modifier.height(24.dp))
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = 2.dp,
                        color = Color(0xFFF3F4F6),
                        shape = RectangleShape,
                    )
                    .padding(vertical = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CustomButton(
                    text = "Próximo passo",
                    icon = Icons.Filled.ArrowForward,
                    //horizontalPadding = 30.dp,
                    onClick = { },
                )
            }
        }
    }
}
