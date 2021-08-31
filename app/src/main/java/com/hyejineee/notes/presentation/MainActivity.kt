package com.hyejineee.notes.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.hyejineee.notes.R
import com.hyejineee.notes.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val notesViewModel:NotesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initObserve()
        notesViewModel.getNotes()
    }

    private fun initObserve(){
        notesViewModel.displayLoading.observe(this){
            binding.isLoading = it
        }
    }

}

