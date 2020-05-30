package com.example.assignment7

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils

import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var items:MutableSet<String> = mutableSetOf()
    private lateinit var adapter: ItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("MyApplication", Context.MODE_PRIVATE)
        val savedText = sharedPreferences.getStringSet("NOTES", setOf<String>())
        if (savedText != null) {
            items = savedText.toMutableSet()
        }
        initRecycler(items)



        addBtn.setOnClickListener {

            val input = inputText.text.toString()


            if (!TextUtils.isEmpty(input)) {
                items.add(inputText.text.toString())
                adapter.addItem(input)
                adapter.notifyDataSetChanged()

                inputText.setText("")

                sharedPreferences.edit().putStringSet("NOTES", items).apply()
            }

        }

    }
    private fun initRecycler(items: MutableSet<String>) {
       recyclerView.layoutManager = LinearLayoutManager(this)
       recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ItemsAdapter(items.toMutableList())
        recyclerView.adapter = adapter
    }

}




