package com.example.androidtodolist.classes

class Task(var title: String, var description: String, var completed: Boolean = false, var dueDate: String? = null) {
    val id: Int = nextId++

    companion object {
        private var nextId = 1
    }

    // For debugging purposes
    override fun toString(): String {
        return "Title: $title, Description: $description, Completed: $completed, Due Date: $dueDate"
    }


}