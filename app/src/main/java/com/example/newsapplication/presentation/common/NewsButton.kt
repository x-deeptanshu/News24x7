package com.example.newsapplication.presentation.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapplication.ui.theme.BaseBlue

@Composable
fun NewsButton(
    Title : String,
    onClick:()->Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = BaseBlue,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(
            text = Title,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                letterSpacing = 0.5.sp
            )
        )
    }
}

@Composable
fun NewsTextButton(
    Title : String,
    onClick:()->Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = if(isSystemInDarkTheme()) Color.White else Color.Black
        )
    ) {
        Text(
            text = Title,
            style = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                letterSpacing = 0.5.sp
            )
        )
    }

}