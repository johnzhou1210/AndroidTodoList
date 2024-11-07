package com.example.androidtodolist.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun SimpleTextField(valueText: String, labelText: String) {
    var text by remember { mutableStateOf(TextFieldValue(valueText)) }
    OutlinedTextField(
        label = { Text(labelText) },
        value = text,
        onValueChange = {
            text = it
        },
    )
}