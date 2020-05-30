package com.example.assignment8

import android.os.Bundle
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var items:MutableSet<String> = mutableSetOf()
    private lateinit var adapter: ItemsAdapter
    private lateinit var dbItems: List<Item>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        dbItems = App.instance.db.getItemDao().getAllItem()

        dbItems.asReversed().forEach {
            items.add(it.item.toString())
        }


        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ItemsAdapter(items.toMutableList())
        recyclerView.adapter = adapter



        addBtn.setOnClickListener {

            val input = inputText.text.toString()


            if (!TextUtils.isEmpty(input)) {
                adapter.addItem(input)
                adapter.notifyDataSetChanged()
                var item = Item(0, input)


                App.instance.db.getItemDao().insert(item)

                inputText.setText("")
            }

        }




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        App.instance.db.getItemDao().deleteAll()
        adapter.deleteItems(mutableListOf())
        return super.onOptionsItemSelected(item)
    }



}





