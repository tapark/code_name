package com.example.code_name_teddy.word

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.databinding.ItemWordSetBinding

class WordSetAdapter(): RecyclerView.Adapter<WordSetAdapter.WordSetViewHolder>() {

    lateinit var wordSetList: MutableList<MutableList<String>>

    inner class WordSetViewHolder(val binding: ItemWordSetBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(wordList: MutableList<String>) {
            val wordAdapter = WordAdpater()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordSetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemWordSetBinding.inflate(layoutInflater, parent, false)
        return WordSetViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordSetViewHolder, position: Int) {
        holder.bind(wordSetList[position])
    }

    override fun getItemCount(): Int {
        return wordSetList.size
    }

    fun initList(list: MutableList<MutableList<String>>) {
        wordSetList = list
        notifyDataSetChanged()
    }
}