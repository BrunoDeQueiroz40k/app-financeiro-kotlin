package components.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.Separator() {
    Box(
        modifier = Modifier
            .weight(1f)
            .height(1.dp)
            .background(Color(0xFFE5E7EB)),
    )
}
