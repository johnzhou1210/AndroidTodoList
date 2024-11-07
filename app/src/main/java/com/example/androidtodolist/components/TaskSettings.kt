package com.example.androidtodolist.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.androidtodolist.classes.Task


@Composable
fun TaskSettings(
    task: Task?,
    onDialogDismissRequest: () -> Unit,
    onTaskDeleteRequest: () -> Unit,
    onTaskSaveRequest: () -> Unit
) {
    Dialog(
        onDismissRequest = { onDialogDismissRequest() }
    ) {
        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Edit Task",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    SimpleTextField(task?.title ?: "", "Title")
                    SimpleTextField(task?.description ?: "", "Description")
                    DatePickerFieldToModal(

                    )

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp)
                    ) {
                        TextButton(
                            onClick = { onTaskDeleteRequest() },
                            modifier = Modifier.padding(top = 5.dp),
                            shape = RoundedCornerShape(10.dp),

                            ) {
                            Text(text = "Delete", style = MaterialTheme.typography.bodyLarge);
                        }

                        TextButton(
                            onClick = { onTaskSaveRequest() },
                            modifier = Modifier.padding(top = 5.dp),
                            shape = RoundedCornerShape(10.dp),

                            ) {
                            Text(text = "Confirm", style = MaterialTheme.typography.bodyLarge);
                        }

                    }

                }
            }
        }

    }
}

