package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.carteirinha.presetantion.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun LabelText(
    modifier: Modifier = Modifier,
    text: String,
    fontSize: TextUnit = 12.sp,
    color: Color = Color(0xFFFF6B7A),
    fontWeight: FontWeight = FontWeight.Bold
) {
    Text(
        text = text.uppercase(),
        fontSize = fontSize,
        color = color,
        fontWeight = fontWeight,
        textAlign = TextAlign.Start,
        modifier = modifier
    )
}
