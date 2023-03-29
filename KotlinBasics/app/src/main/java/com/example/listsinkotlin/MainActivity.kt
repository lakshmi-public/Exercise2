package com.example.listsinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasics.R
import com.example.kotlinbasics.databinding.ActivityMainBinding
import com.example.kotlinbasics.viewmodel.DiceViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item1 = Noodles()
        val item_veg  = Vegetables("cabage")
        //order example without builder pattern
        val order1 = Order(1).addItem(item1)
        //order example with builder pattern
        val order2 = Order(2).addItem(Noodles()).addItem(Vegetables("Cabage","tomoto")).addItem(Vegetables())

    }
}