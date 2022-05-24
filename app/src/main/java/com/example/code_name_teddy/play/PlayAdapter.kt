package com.example.code_name_teddy.play

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.ItemGoalBinding
import com.example.code_name_teddy.databinding.ItemPlayBinding

class PlayAdapter(val width: Int, val height: Int, val fragment: PlayFragment): RecyclerView.Adapter<PlayAdapter.PlayViewHolder>() {

    lateinit var playList: MutableList<String>

    inner class PlayViewHolder(val binding: ItemPlayBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String) {
            val params = binding.parentLayout.layoutParams
            params.width = width / 5
            params.height = height / 5
            binding.parentLayout.layoutParams = params

            binding.topTextView.text = word
            binding.bottomTextView.text = word

            binding.root.setOnClickListener {
                SelectCardDialog { color ->
                    when (color) {
                        COLOR_RED -> {
                            binding.cardLayout.setBackgroundResource(R.drawable.background_red_card)
                            binding.bottomTextView.setTextColor(Color.WHITE)
                        }
                        COLOR_BLUE -> {
                            binding.cardLayout.setBackgroundResource(R.drawable.background_blue_card)
                            binding.bottomTextView.setTextColor(Color.WHITE)
                        }
                        COLOR_WHITE -> {
                            binding.cardLayout.setBackgroundResource(R.drawable.background_white_card)
                            binding.bottomTextView.setTextColor(Color.WHITE)
                        }
                        COLOR_BLACK -> {
                            binding.cardLayout.setBackgroundResource(R.drawable.background_black_card)
                            binding.bottomTextView.setTextColor(Color.WHITE)
                        }
                        COLOR_RESET -> {
                            binding.cardLayout.setBackgroundResource(R.drawable.background_white_card)
                            binding.bottomTextView.setTextColor(Color.BLACK)
                        }
                    }
                }.show(fragment.parentFragmentManager, null)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = ItemPlayBinding.inflate(layoutInflater, parent, false)
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