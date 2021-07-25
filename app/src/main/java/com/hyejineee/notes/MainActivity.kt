package com.hyejineee.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hyejineee.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val notes = listOf("note 1","note 1","note 1" )
    val noteAdapter = NotesAdapter(notes)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply {
            listMainNotes.layoutManager = LinearLayoutManager(this@MainActivity)
            listMainNotes.adapter = noteAdapter
        }

    }

}

