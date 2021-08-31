package com.hyejineee.notes.presentation

import com.hyejineee.notes.presentation.records.RecordListViewModel
import io.kotest.common.ExperimentalKotest
import io.kotest.core.Tag
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import javax.inject.Inject

/**
 * TODO : 노트 리스트 보여주기
 * TODO : 가져온 노트가 없을 경우 보여줄 메세지 전달
 * TODO : 노트를 가져올 때 사용자에게 작업중 표시하기
 * */

object Describe : Tag()


// TODO : 각각 어노테이션이 어떤 역할을 하는지 공부할 것
@ExperimentalKotest
@ObsoleteCoroutinesApi
@ExperimentalCoroutinesApi
class RecordListViewModelTest :ViewModelTest() {

    lateinit var viewModel: RecordListViewModel

    override fun setUp() {
        viewModel = RecordListViewModel()
    }

    override fun tearDown() {

    }

    init {
        runBlockingTest {
            describe("RecordListViewModel"){
                context("fetch records"){
                    it("get records"){
                        val testObservable = viewModel.recordsLiveData().test()
                        viewModel.fetch()


                    }
                }
            }
        }
    }
}

