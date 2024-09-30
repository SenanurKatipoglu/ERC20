package com.example.erc20token.base.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.erc20token.ui.theme.PrimaryColor

/**
 * Created by KATIPOGLU on 22.09.2024.
 */

@Composable
fun PrimaryButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
) {

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Button(
        onClick = onClick, modifier = modifier.height(44.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isPressed) Color.White else PrimaryColor,
            contentColor = PrimaryColor
        )
    ) {
        Text(text = text, color = Color.White)
    }
}
