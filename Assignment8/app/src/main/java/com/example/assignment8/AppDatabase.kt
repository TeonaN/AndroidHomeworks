package com.example.assignment8

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getItemDao(): ItemDao
}


