package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

enum class InputType { InputEmail, InputPassword }

@Composable
fun Input(inputText: String, inputPlaceholderText: String, type: InputType) {
    var text by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    val keyboardType = when (type) {
        InputType.InputEmail -> KeyboardType.Email
        InputType.InputPassword -> KeyboardType.Password
    }

    val visualTransformation = when (type) {
        InputType.InputEmail -> VisualTransformation.None
        InputType.InputPassword ->
            if (passwordVisible) VisualTransformation.None
            else PasswordVisualTransformation()
    }

    val leadingIconVector: ImageVector = when (type) {
        InputType.InputEmail -> Icons.Outlined.Email
        InputType.InputPassword -> Icons.Filled.Lock
    }

    Column(
        modifier = when (type) {
            InputType.InputEmail -> Modifier.padding(35.dp, 30.dp)
            InputType.InputPassword -> Modifier.padding(35.dp, 0.dp)
        },
    ) {
        Text(
            inputText,
            color = Color(0xFF374151),
            fontWeight = FontWeight.SemiBold,
        )
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
                .background(
                    Color(0xFFF9FAFB),
                    RoundedCornerShape(20.dp),
                ),
            singleLine = true,
            shape = RoundedCornerShape(20.dp),
            visualTransformation = visualTransformation,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFE5E7EB),
                unfocusedBorderColor = Color(0xFFE0E0E0),
                errorBorderColor = MaterialTheme.colorScheme.error,
                cursorColor = Color(0xFF2A68ED),
            ),
            placeholder = {
                Text(
                    inputPlaceholderText,
                    color = Color(0xFF9CA3AF),
                    fontWeight = FontWeight.Bold,
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            leadingIcon = {
                Icon(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .size(20.dp),
                    imageVector = leadingIconVector,
                    contentDescription = null,
                    tint = Color(0xFF9CA3AF),
                )
            },
            trailingIcon = if (type == InputType.InputPassword) {
                {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            modifier = Modifier.size(22.dp),
                            imageVector = if (passwordVisible) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                            contentDescription = if (passwordVisible) "Ocultar senha" else "Mostrar senha",
                            tint = Color(0xFF9CA3AF),
                        )
                    }
                }
            } else {
                null
            },
        )
    }
}
