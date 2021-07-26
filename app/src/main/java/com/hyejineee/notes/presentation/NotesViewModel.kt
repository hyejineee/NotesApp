package com.hyejineee.notes.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel:ViewModel() {

    private var _displayLoading = MutableLiveData(false)
    val displayLoading get() = _displayLoading

    private var _notes = MutableLiveData<List<String>>()
        set(value) {
            stopLoading()
            field = value
        }
    val notes get() = _notes

    fun getNotes(){
        startLoading()
        _notes.value = listOf("hi")
    }

    private fun startLoading(){
        displayLoading.value = true
    }

    private fun stopLoading(){
        displayLoading.value = false
    }

}


