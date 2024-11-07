package com.example.androidtodolist.components

import android.util.Log
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidtodolist.classes.Task

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TaskItem(task: Task, interactionSource: MutableInteractionSource, ) {
    val view = LocalView.current
    var userTasks: TaskViewModel = viewModel()

    fun onTaskItemClicked(task: Task) {
        userTasks.SetActiveTaskId(task.id)
        Log.d("io", task.id.toString())
    }

    Row(
        modifier = Modifier.padding(6.dp)
            .fillMaxWidth()
            .clickable(
                onClick = {
                    onTaskItemClicked(task)
                }
            )
//            .indication(interactionSource = interactionSource, indication = rememberRipple()).clip(RoundedCornerShape(15.dp)).background(MaterialTheme.colorScheme.inverseOnSurface)


    ) {

        Text(
            text = task.title + " " + task.id.toString() ,
            fontSize = 16.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(16.dp).weight(1f).clip(RoundedCornerShape(15.dp)).background(MaterialTheme.colorScheme.inverseOnSurface),
            maxLines = 1

        )
    }



}


