package com.hyejineee.notes.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import com.hyejineee.notes.InstantExecutorListener
import com.hyejineee.notes.presentation.Util.LiveDataTestObserver
import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.DescribeSpec
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain

@ExperimentalCoroutinesApi
abstract class ViewModelTest:DescribeSpec() {

    private val testDispatcher = TestCoroutineDispatcher()

    override fun beforeSpec(spec: Spec) {
        super.beforeSpec(spec)
        Dispatchers.setMain(testDispatcher)
    }

    override fun afterSpec(spec: Spec) {
        super.afterSpec(spec)
        Dispatchers.resetMain()
    }


    protected fun <T>LiveData<T>.test(): LiveDataTestObserver<T> {
        val testObserver = LiveDataTestObserver<T>()
        this.observeForever(testObserver)
        return testObserver
    }

    init {
        listener(InstantExecutorListener())
    }
}