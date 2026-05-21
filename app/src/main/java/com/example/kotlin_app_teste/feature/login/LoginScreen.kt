package com.example.kotlin_app_teste.feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Beenhere
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import components.ui.CustomButton
import com.example.kotlin_app_teste.core.designsystem.component.login.Header
import components.ui.Input
import components.ui.InputType
import com.example.kotlin_app_teste.core.designsystem.component.login.LoginAsButton
import components.ui.Separator
import com.example.kotlin_app_teste.core.navigation.Routes

@Composable
fun LoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White),
    ) {
        Header()
        Input(
            inputText = "E-mail ou Usuário",
            inputPlaceholderText = "exemplo@email.com",
            type = InputType.InputEmail
        )
        Input(
            inputText = "Senha",
            inputPlaceholderText = "•••••••••",
            type = InputType.InputPassword
        )
        Box(
            modifier = Modifier
                .padding(40.dp, 25.dp)
                .align(Alignment.End),
        ) {
            Text(
                "Esqueci minha senha",
                color = Color(0xFF2563EB),
                fontWeight = FontWeight.Bold,
            )
        }
        CustomButton(
            text = "Entrar na Conta",
            icon = Icons.Filled.ArrowForward,
            onClick = { navController.navigate(Routes.WELCOME) },
        )
        Box(
            modifier = Modifier
                .padding(40.dp, 15.dp)
                .align(Alignment.CenterHorizontally),
        ) {
            Text(
                "Novo? Crie uma conta!",
                color = Color(0xFF2563EB),
                fontWeight = FontWeight.Bold,
            )
        }
        Row(
            modifier = Modifier
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Separator()
            Text(
                "OU CONTINUE COM",
                modifier = Modifier
                    .padding(15.dp, 0.dp, 15.dp, 10.dp),
                color = Color(0xFF9CA3AF)
            )
            Separator()
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            LoginAsButton(
                text = "Entrar com Google",
                icon = Icons.Filled.Beenhere,
                backgroundColor = Color.White,
                textColor = Color.Black
            )
            LoginAsButton(
                text = "Entrar com Apple",
                icon = Icons.Filled.AcUnit,
                backgroundColor = Color.Black
            )
        }
    }
}
