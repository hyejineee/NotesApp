package com.hyejineee.notes.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hyejineee.notes.R
import com.hyejineee.notes.databinding.ActivityRecordlistBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecordListActivity : AppCompatActivity() {

    lateinit var binding:ActivityRecordlistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecordlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initObserver()
    }

    private fun initObserver(){

    }

}

