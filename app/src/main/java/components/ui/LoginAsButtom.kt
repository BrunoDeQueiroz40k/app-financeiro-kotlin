package components.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginAsButton(
    text: String,
    icon: ImageVector? = null,
    backgroundColor: Color = Color(0xFF2A68ED),
    textColor: Color = Color.White
) {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(35.dp, 0.dp)
            .drawBehind {
                drawOutline(
                    outline = RoundedCornerShape(15.dp).createOutline(size, layoutDirection, this),
                    color = backgroundColor,
                )
            },
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color.White,
        ),
        border = BorderStroke(1.dp, Color(0xFFE0E0E0)),
    ) {
        Row(
            modifier = Modifier.padding(0.dp, 6.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if(icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(20.dp),
                    tint = Color.White,
                )
            }
            Text(
                text,
                fontSize = 16.sp,
                color = textColor
            )
        }
    }
}
