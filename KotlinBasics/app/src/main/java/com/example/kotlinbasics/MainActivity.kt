package com.example.kotlinbasics

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasics.databinding.ActivityMainBinding
import com.example.kotlinbasics.viewmodel.DiceViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var diceViewModel: DiceViewModel
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        diceViewModel = ViewModelProvider(this)[DiceViewModel::class.java]
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupClickListeners()
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }
    private fun setupClickListeners(){

        binding.diceBt.setOnClickListener{


                updateImage(diceViewModel.rollDice())
        }
    }
    private fun updateImage(num: Int){
        val imageDrawable = when(num){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        binding.imageview.setImageResource(imageDrawable)
        binding.imageview.contentDescription = imageDrawable.toString()
    }
}