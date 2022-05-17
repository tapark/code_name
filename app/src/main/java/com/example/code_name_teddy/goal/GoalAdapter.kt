package com.example.code_name_teddy.goal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.COLOR_BLACK
import com.example.code_name_teddy.COLOR_BLUE
import com.example.code_name_teddy.COLOR_RED
import com.example.code_name_teddy.COLOR_WHITE
import com.example.code_name_teddy.databinding.ItemGoalBinding

class GoalAdapter: ListAdapter<Int, GoalAdapter.GoalViewHolder>(diffUtil) {

    inner class GoalViewHolder(val binding: ItemGoalBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(color: Int) {
            when (color) {
                COLOR_RED -> { binding.cardLayout.setBackgroundColor(Color.RED) }
                COLOR_BLUE -> { binding.cardLayout.setBackgroundColor(Color.BLUE) }
                COLOR_WHITE -> { binding.cardLayout.setBackgroundColor(Color.WHITE) }
                COLOR_BLACK -> { binding.cardLayout.setBackgroundColor(Color.BLACK) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemGoalBinding.inflate(layoutInflater, parent, false)
        return GoalViewHolder(view)
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object: DiffUtil.ItemCallback<Int>() {
            override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
                return oldItem == newItem
            }

        }
    }
}