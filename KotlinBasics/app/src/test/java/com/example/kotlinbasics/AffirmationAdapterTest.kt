package com.example.kotlinbasics

import android.content.Context
import com.example.recyclerview.adapter.ItemAdapter
import com.example.recyclerview.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationAdapterTest {

    private val context = mock(Context::class.java)
    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2)
        )
        val adapter = ItemAdapter(context,data)
        assertEquals("ItemAdapter is not the correct size",data.size,adapter.itemCount)
    }
}