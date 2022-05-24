package com.example.code_name_teddy.play

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.databinding.ItemPlayWordBinding

class PlayWordAdapter: RecyclerView.Adapter<PlayWordAdapter.WordSetViewHolder>() {

    lateinit var wordList: MutableList<String>

    inner class WordSetViewHolder(val binding: ItemPlayWordBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String) {
            binding.wordTextView.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordSetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemPlayWordBinding.inflate(layoutInflater, parent, false)
        return WordSetViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordSetViewHolder, position: Int) {
        holder.bind(wordList[position])
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    fun initList(list: MutableList<String>) {
        wordList = list
        notifyDataSetChanged()
    }
}