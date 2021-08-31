package com.hyejineee.notes.presentation.Util

import androidx.lifecycle.Observer

class LiveDataTestObserver<T> : Observer<T> {

    val values = mutableListOf<T>()

    override fun onChanged(t: T) {
        values.add(t)
    }

    fun assertSequences(expectedValues: List<T>):LiveDataTestObserver<T> {
        var i = 0
        val actualIterator = values.iterator()
        val expectedIterator = expectedValues.iterator()

        var actualNext: Boolean
        var expectNext: Boolean

        println(
            "비교 - actual : ${values}, expected : ${expectedValues}"
        )

        while (true) {
            actualNext = actualIterator.hasNext()
            expectNext = expectedIterator.hasNext()

            if (!actualNext || !expectNext) break

            val actual: T = actualIterator.next()
            val expected: T = expectedIterator.next()

            if (actual != expected) {
                throw AssertionError("actual : ${actual}, expected : ${expected}, index:${i}")
            }

            i++
        }

        if (actualNext) {
            throw AssertionError("More valued received than expected ($i)")
        }

        if (expectNext) {
            throw AssertionError("Fewer values received than expected ($i)")
        }

        return this
    }

}