package com.example.androidtodolist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalView
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidtodolist.components.BottomBar
import com.example.androidtodolist.components.TaskList
import com.example.androidtodolist.components.TaskSettings
import com.example.androidtodolist.components.TaskViewModel
import com.example.androidtodolist.components.TopBar


class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBar() }
                ) { paddingValues ->

                    val view = LocalView.current
                    var viewModel: TaskViewModel = viewModel()
                    val activeId = viewModel.ActiveTaskId.collectAsState().value
                    Log.d("io", "activeId: $activeId")

                    fun onDialogDismissRequest() {
                        viewModel.SetActiveTaskId(-1)
                    }

                    fun onTaskDeleteRequest() {
                        onDialogDismissRequest()
                        // Delete task

                    }

                    fun onTaskSaveRequest() {
                        onDialogDismissRequest()
                        // Save task

                    }

                    TaskList(paddingValues)
                    if (activeId != -1) {
                        TaskSettings(
                            viewModel.UserTasks.find { it.id == activeId  },
                            onDialogDismissRequest = { onDialogDismissRequest() },
                            onTaskDeleteRequest = { onTaskDeleteRequest() },
                            onTaskSaveRequest = { onTaskSaveRequest() }
                        )
                    }
                }
            }
        }
    }



}
