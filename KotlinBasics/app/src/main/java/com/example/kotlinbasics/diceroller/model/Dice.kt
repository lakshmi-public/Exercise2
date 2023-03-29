package com.example.kotlinbasics.diceroller.model

data class Dice(val sides : Int){
    fun roll(): Int {
        return (1..sides).random()
    }
}
