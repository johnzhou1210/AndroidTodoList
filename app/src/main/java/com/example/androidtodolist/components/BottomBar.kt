package com.example.androidtodolist.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomBar() {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface,
        tonalElevation = BottomAppBarDefaults.ContainerElevation,
        actions = {

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(start = 12.dp, end = 12.dp, top = 12.dp, bottom = 12.dp)

            ) {
                // Undone tasks button
                TextButton(
                    onClick = {/*TODO*/ },
                    modifier = Modifier
                        .width(120.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(10.dp)

                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.List,
                            contentDescription = "Localized description"
                        )
                        Text(text = "Todo", modifier = Modifier.padding(start = 11.dp), style = TextStyle(fontSize = 20.sp))
                    }

                }
                Spacer(modifier = Modifier.width(15.dp))
                // Add task button
                TextButton(
                    onClick = {/*TODO*/ },
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .weight(1f),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        disabledContainerColor = MaterialTheme.colorScheme.onSurface,
                        disabledContentColor = MaterialTheme.colorScheme.onSurface
                    )
                ){
                    Icon(Icons.Filled.Add, contentDescription = "Localized description", modifier = Modifier.size(60.dp))
                }
                Spacer(modifier = Modifier.width(15.dp))
                // Finished tasks button
                TextButton(
                    onClick = {/*TODO*/ },
                    modifier = Modifier
                        .width(120.dp)
                        .height(60.dp),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Row {
                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
                        Text(text = "Done", modifier = Modifier.padding(start = 11.dp), style = TextStyle(fontSize = 20.sp))
                    }

                }
            }
        }

    )


}
