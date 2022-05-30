package com.example.code_name_teddy.room_database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WordSet1(
    @ColumnInfo(name = "word") var word: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

@Entity
data class WordSet2(
    @ColumnInfo(name = "word") var word: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

@Entity
data class WordSet3(
    @ColumnInfo(name = "word") var word: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

@Entity
data class WordSet4(
    @ColumnInfo(name = "word") var word: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}

@Entity
data class WordSet5(
    @ColumnInfo(name = "word") var word: String
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}