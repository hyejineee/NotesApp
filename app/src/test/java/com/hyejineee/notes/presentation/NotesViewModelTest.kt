package com.hyejineee.notes.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.hyejineee.notes.InstantExecutorListener
import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.matchers.shouldBe
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

/**
 * TODO : 노트 리스트 보여주기
 * TODO : 가져온 노트가 없을 경우 보여줄 메세지 전달
 * TO DO : 노트를 가져올 때 사용자에게 작업중 표시하기
 * */

class NotesViewModelTest:DescribeSpec(){

//    mock
//    private repo = NoteRepository()
//
//    private getNotesUseCase = GetNotesUseCase(repo)
    private val notesViewModel = NotesViewModel()
    private val displayLoadingObserver = Observer<Boolean>(){}

    override fun beforeEach(testCase: TestCase) {
        super.beforeEach(testCase)

        notesViewModel.displayLoading.observeForever(displayLoadingObserver)
    }

    override fun afterEach(testCase: TestCase, result: TestResult) {
        super.afterEach(testCase, result)
        notesViewModel.displayLoading.removeObserver(displayLoadingObserver)
    }

    init {
        listeners(InstantExecutorListener())

        describe("display loading status"){

            context("when fetch notes from database by use case"){
                notesViewModel.getNotes()
                it("publish loading status as true"){
                    notesViewModel.displayLoading.value = true
                }
            }

            context("whe fetch notes is finished"){
                it("publish loading status as false"){
                    notesViewModel.displayLoading.value = false
                }

            }
        }
    }
}
