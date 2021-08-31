package com.hyejineee.notes.presentation.records

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hyejineee.notes.data.Record
import com.hyejineee.notes.domain.GetRecordsUseCase

class RecordListViewModel(
    private val getRecordsUseCase: GetRecordsUseCase,
) :ViewModel() {

    val _recordsLiveData = MutableLiveData<List<Record>>()
    val recordLiveData:LiveData<List<Record>> = _recordsLiveData

    fun fetch(){
        getRecordsUseCase()
    }


}
