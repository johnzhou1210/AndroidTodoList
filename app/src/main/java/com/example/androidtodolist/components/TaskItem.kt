package com.example.androidtodolist.components

import android.content.ClipData
import android.view.View
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.draganddrop.dragAndDropSource
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropTransferData
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtodolist.classes.Task

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TaskItem(task: Task, interactionSource: MutableInteractionSource, ) {
    Row(
        modifier = Modifier.padding(6.dp)
            .fillMaxWidth()
            .clickable(
                onClick = {
                    task.isDone = !task.isDone
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


