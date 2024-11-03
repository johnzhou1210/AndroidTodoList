package com.example.androidtodolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import com.example.androidtodolist.classes.Task
import com.example.androidtodolist.components.Floater
import com.example.androidtodolist.components.TaskList
import com.example.androidtodolist.components.TopBar


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Scaffold(
                    topBar = { TopBar() },
                    floatingActionButton = { Floater() }
                ) { paddingValues ->
                    TaskList(paddingValues)
                }
            }
        }
    }
}
