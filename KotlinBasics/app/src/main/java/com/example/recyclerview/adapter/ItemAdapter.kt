package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbasics.R
import com.example.recyclerview.model.Affirmation

class ItemAdapter (val context: Context, val data:List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){




    class ItemViewHolder(private val view :View):RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //This argument needs to be false, because RecyclerView adds this item to the view hierarchy for you when it's time.
        val adapterLayout = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = context.resources.getString(data[position].resourceId)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}