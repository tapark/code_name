package com.example.code_name_teddy

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    val wordList1 = mutableListOf<String>()
    val wordList2 = mutableListOf<String>()
    val wordList3 = mutableListOf<String>()
    val wordList4 = mutableListOf<String>()
    val wordList5 = mutableListOf<String>()

    val wordSetList = mutableListOf(wordList1, wordList2, wordList3, wordList4, wordList5)
}