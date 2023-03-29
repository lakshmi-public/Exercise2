package com.example.listsinkotlin

class Vegetables(vararg val toppings: String): Item("Vegetables",5) {
    override fun toString(): String {
        return name +""+toppings.joinToString()
    }
}