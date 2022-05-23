package com.example.code_name_teddy.play

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.ItemGoalBinding

class PlayAdapter(val width: Int, val height: Int): RecyclerView.Adapter<PlayAdapter.PlayViewHolder>() {

    lateinit var playList: MutableList<String>

    inner class PlayViewHolder(val binding: ItemGoalBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String) {
            val params = binding.parentLayout.layoutParams
            params.width = width / 5
            params.height = height / 5
            binding.parentLayout.layoutParams = params


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemGoalBinding.inflate(layoutInflater, parent, false)
        return PlayViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayViewHolder, position: Int) {
        holder.bind(playList[position])
    }

    override fun getItemCount(): Int {
        return playList.size
    }

    fun initList(list: MutableList<String>) {
        playList = list
        notifyDataSetChanged()
    }
}