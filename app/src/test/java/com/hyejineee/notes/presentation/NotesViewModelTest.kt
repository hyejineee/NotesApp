package com.hyejineee.notes.presentation

import androidx.lifecycle.SavedStateHandle
import com.hyejineee.notes.InstantExecutorListener
import com.hyejineee.notes.getOrAwaitValue
import io.kotest.common.ExperimentalKotest
import io.kotest.core.Tag
import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.mockito.Mock
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

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
class NotesViewModelTest :ViewModelTest() {

}

