package com.example.code_name_teddy.room_database

import androidx.room.*

@Dao
interface WordSetDao1 {
    @Query("SELECT * FROM wordset1")
    fun getAll(): List<WordSet1>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: WordSet1)

    @Delete
    fun delete(word: WordSet1)
}

@Dao
interface WordSetDao2 {
    @Query("SELECT * FROM wordset2")
    fun getAll(): List<WordSet2>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: WordSet2)

    @Delete
    fun delete(word: WordSet2)
}

@Dao
interface WordSetDao3 {
    @Query("SELECT * FROM wordset3")
    fun getAll(): List<WordSet3>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: WordSet3)

    @Delete
    fun delete(word: WordSet3)
}

@Dao
interface WordSetDao4 {
    @Query("SELECT * FROM wordset4")
    fun getAll(): List<WordSet4>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: WordSet4)

    @Delete
    fun delete(word: WordSet4)
}

@Dao
interface WordSetDao5 {
    @Query("SELECT * FROM wordset5")
    fun getAll(): List<WordSet5>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: WordSet5)

    @Delete
    fun delete(word: WordSet5)
}