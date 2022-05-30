package com.example.code_name_teddy.word

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.databinding.ItemWordSetBinding
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import com.google.android.flexbox.JustifyContent

class WordSetAdapter(val onDelete: (String) -> Unit): RecyclerView.Adapter<WordSetAdapter.WordSetViewHolder>() {

    lateinit var wordSetList: MutableList<MutableList<String>>

    inner class WordSetViewHolder(val binding: ItemWordSetBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(wordList: MutableList<String>) {
            val wordAdapter = WordAdapter { word, position ->
                wordList.removeAt(position)
                onDelete(word)
            }
            FlexboxLayoutManager(itemView.context).apply {
                flexWrap = FlexWrap.WRAP
                flexDirection = FlexDirection.ROW
                justifyContent = JustifyContent.FLEX_START
            }.let {
                binding.wordRecyclerView.layoutManager = it
            }
            wordAdapter.initList(wordList)
            binding.wordRecyclerView.adapter = wordAdapter
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