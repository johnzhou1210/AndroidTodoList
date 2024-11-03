package com.example.androidtodolist.components


import android.util.Log
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp

import androidx.lifecycle.viewmodel.compose.viewModel
import org.burnoutcrew.reorderable.ReorderableItem
import org.burnoutcrew.reorderable.detectReorderAfterLongPress
import org.burnoutcrew.reorderable.rememberReorderableLazyListState
import org.burnoutcrew.reorderable.reorderable


@Composable
fun TaskList(
    paddingValues: PaddingValues
) {

    val view = LocalView.current
    var userTasks: TaskViewModel = viewModel()


    val interactionSource = remember { MutableInteractionSource() }

    val state = rememberReorderableLazyListState(onMove = { from, to ->
        userTasks.reorderTask(from.index, to.index)
    })

    LazyColumn(
        state = state.listState,
        modifier = Modifier.padding(paddingValues)
            .reorderable(state)
            .detectReorderAfterLongPress(state)
    ) {
        items(userTasks.UserTasks, { it.id }) { item ->
            ReorderableItem(state, key = item) { isDragging ->
                Log.d("io", userTasks.UserTasks[0].toString())
                val elevation = animateDpAsState(if (isDragging) 16.dp else 0.dp)
                Column(
                    modifier = Modifier
                        .shadow(elevation.value)
                        .background(if (isDragging) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface)
                ) {
                    TaskItem(item, interactionSource)
                }




            }


        }
    }


}




