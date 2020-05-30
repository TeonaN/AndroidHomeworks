package com.example.assignment8

import androidx.room.*

@Dao
interface ItemDao {
    @Query("SELECT * FROM ITEMS")
    fun getAllItem(): List<Item>

    @Query("SELECT * FROM ITEMS A WHERE A.ItemId IN (:itemIds)")
    fun getItemsByIds(itemIds: IntArray):List<Item>



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vararg items: Item)


    @Query("DELETE FROM items")
    fun deleteAll()

}