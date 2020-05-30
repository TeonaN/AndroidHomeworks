package com.example.assignment8

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ITEMS")
data class Item(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ItemId")
    val itemId: Long,


    @ColumnInfo(name = "Item")
    val item: String?

)



