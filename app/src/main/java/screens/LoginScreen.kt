package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AcUnit
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Beenhere
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.Header
import components.Input
import components.InputType
import components.ui.CustomButton
import components.ui.LoginAsButton
import components.ui.Separator

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
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
            icon = Icons.Filled.ArrowForward
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