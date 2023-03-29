package com.example.kotlinbasics.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kotlinbasics.diceroller.model.Dice

class DiceViewModel : ViewModel() {

    fun rollDice(): Int {
        return Dice(6).roll()
    }
}