package com.example.listsinkotlin

class Order(val orderNumber:Int) {
    private val itemList =  mutableListOf<Item>()

    //these are without including builder pattern
//    fun addItem(newItem: Item){
//        itemList.add(newItem)
//
//    }
//    fun addAll(newItems:List<Item>){
//        itemList.addAll(newItems)
//    }
//these are improved by  including builder pattern
    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this

    }
    fun addAll(newItems:List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }
}