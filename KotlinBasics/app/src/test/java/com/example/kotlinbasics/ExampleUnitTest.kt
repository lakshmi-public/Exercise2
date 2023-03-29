package com.example.kotlinbasics

import com.example.kotlinbasics.viewmodel.DiceViewModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun generate_number(){
        val viewModel = DiceViewModel()
        val result = viewModel.rollDice()
        assertTrue("it's in range4 cz",result in 1..6)
    }
}