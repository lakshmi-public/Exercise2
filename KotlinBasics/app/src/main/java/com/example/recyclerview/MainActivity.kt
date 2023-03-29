package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbasics.R
import com.example.recyclerview.adapter.ItemAdapter
import com.example.recyclerview.data.Datasource


//In Kotlin, null means the absence of a value.
class MainActivity: AppCompatActivity() {
    // this is useful do declare constants
    //only a single instance of a companion object will exist for the duration of your program,
     companion object{
        const val LETTER = "letter"
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_main_recyclerview)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val dataSet = Datasource().loadAffirmations()
        recyclerView.adapter = ItemAdapter(this,dataSet)
    }

}