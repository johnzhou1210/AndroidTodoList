package com.example.androidtodolist.components

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.androidtodolist.classes.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TaskViewModel : ViewModel() {
    var UserTasks = mutableStateListOf<Task>()
    private var _activeTaskId = MutableStateFlow(-1) // -1 for no active task
    var ActiveTaskId: StateFlow<Int> = _activeTaskId

    init {
        UserTasks.addAll(
            listOf(
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task(
                    "Do math homework!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
                    "Finish it before 11:59 PM"
                ),
                Task("Do the dishes", "Use only the dishwasher"),
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task("Do math homework", "Finish it before 11:59 PM"),
                Task("Do the dishes", "Use only the dishwasher"),
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task("Do math homework", "Finish it before 11:59 PM"),
                Task("Do the dishes", "Use only the dishwasher"),
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task("Do math homework", "Finish it before 11:59 PM"),
                Task("Do the dishes", "Use only the dishwasher"),
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task("Do math homework", "Finish it before 11:59 PM"),
                Task("Do the dishes", "Use only the dishwasher"),
                Task("Walk the dog", "Go only the route in which the sun rises"),
                Task("Do math homework", "Finish it before 11:59 PM"),
                Task("Do the dishes", "Use only the dishwasher"),

                )
        )
    }


    fun reorderTask(fromIndex: Int, toIndex: Int) {
        val task = UserTasks.removeAt(fromIndex)
        UserTasks.add(toIndex, task)
    }

    fun SetActiveTaskId(taskId: Int) {
        _activeTaskId.update { taskId }
    }



}