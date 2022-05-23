package com.example.code_name_teddy.word

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.databinding.ItemWordBinding


class WordAdapter(val onClick: (String) -> Unit): RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    lateinit var wordList: MutableList<String>

    inner class WordViewHolder(val binding: ItemWordBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String, position: Int) {
            binding.wordTextView.text = word
            binding.deleteWordButton.setOnClickListener {
                onClick(word)
                notifyItemRemoved(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemWordBinding.inflate(layoutInflater, parent, false)
        return WordViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(wordList[position], position)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    fun initList(list: MutableList<String>) {
        wordList = list
        notifyDataSetChanged()
    }
}