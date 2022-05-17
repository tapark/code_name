package com.example.code_name_teddy.goal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.ItemGoalBinding

class GoalAdapter(val width: Int, val height: Int): RecyclerView.Adapter<GoalAdapter.GoalViewHolder>() {

    lateinit var colorList: MutableList<Int>

    inner class GoalViewHolder(val binding: ItemGoalBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(color: Int) {
            val params = binding.parentLayout.layoutParams
            params.width = width / 5
            params.height = height / 5
            binding.parentLayout.layoutParams = params

            when (color) {
                COLOR_RED -> { binding.cardLayout.setBackgroundResource(R.drawable.background_red_card) }
                COLOR_BLUE -> { binding.cardLayout.setBackgroundResource(R.drawable.background_blue_card) }
                COLOR_WHITE -> { binding.cardLayout.setBackgroundResource(R.drawable.background_white_card) }
                COLOR_BLACK -> { binding.cardLayout.setBackgroundResource(R.drawable.background_black_card) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemGoalBinding.inflate(layoutInflater, parent, false)
        return GoalViewHolder(view)
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        holder.bind(colorList[position])
    }

    override fun getItemCount(): Int {
        return colorList.size
    }

    fun initList(list: MutableList<Int>) {
        colorList = list
        notifyDataSetChanged()
    }
}