package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ItemsAdapter(getProducts())
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }

    private fun getProducts(): List<Items> {

        val i1 = Items(1, "Photos", "Photos description", R.drawable.photos)
        val i2 = Items(2, "Camera", "Camera description", R.drawable.camera)
        val i3 = Items(3, "Mobile", "Mobile description", R.drawable.mobile)
        val i4 = Items(4, "Checklist", "List description", R.drawable.checklist)
        val i5 = Items(5, "Photos", "Photos description", R.drawable.photos)
        val i6 = Items(6, "Camera", "Camera description", R.drawable.camera)
        val i7 = Items(7, "Mobile", "Mobile description", R.drawable.mobile)
        val i8 = Items(8, "Checklist", "List description", R.drawable.checklist)

        val returnList = ArrayList<Items>()

        returnList.add(i1)
        returnList.add(i2)
        returnList.add(i3)
        returnList.add(i4)
        returnList.add(i5)
        returnList.add(i6)
        returnList.add(i7)
        returnList.add(i8)

        return returnList

    }

}