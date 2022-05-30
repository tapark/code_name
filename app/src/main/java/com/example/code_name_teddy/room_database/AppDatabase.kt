package com.example.code_name_teddy.room_database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WordSet1::class, WordSet2::class, WordSet3::class, WordSet4::class, WordSet5::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun wordSetDao1(): WordSetDao1
    abstract fun wordSetDao2(): WordSetDao2
    abstract fun wordSetDao3(): WordSetDao3
    abstract fun wordSetDao4(): WordSetDao4
    abstract fun wordSetDao5(): WordSetDao5
}

fun getAppDatabase(context: Context): AppDatabase {

    return Room.databaseBuilder(context, AppDatabase::class.java, "WordSetDB").build()
}