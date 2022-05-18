package com.example.code_name_teddy.goal

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.FragmentGoalBinding
import com.example.code_name_teddy.utils.dpToPx
import java.util.*

class GoalFragment: Fragment() {

    lateinit var binding: FragmentGoalBinding
    lateinit var goalAdapter: GoalAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_goal, container, false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        onClick()
    }

    private fun initAdapter() {
        activity?.let {
            val windowWidth = (activity as MainActivity).binding.fragmentContainer.width - dpToPx(requireContext(), 56)
            val windowHeight = (activity as MainActivity).binding.fragmentContainer.height

            goalAdapter = GoalAdapter(windowWidth, windowHeight)
            binding.goalRecyclerView.adapter = goalAdapter
            getRandomPosition()
        }
    }

    private fun getRandomPosition() {

        var cardList = mutableListOf<Int>()

        var red_count = COUNT_RED
        var blue_count = COUNT_BLUE

        when((0..1).random()) {
            0 -> {
                red_count += COUNT_SPY
                binding.firstCardTextView.text = red_count.toString()
                binding.secondCardTextView.text = blue_count.toString()
                binding.firstCardTextView.setBackgroundResource(R.drawable.background_red_card)
                binding.secondCardTextView.setBackgroundResource(R.drawable.background_blue_card)
            }
            1 -> {
                blue_count += COUNT_SPY
                binding.firstCardTextView.text = blue_count.toString()
                binding.secondCardTextView.text = red_count.toString()
                binding.firstCardTextView.setBackgroundResource(R.drawable.background_blue_card)
                binding.secondCardTextView.setBackgroundResource(R.drawable.background_red_card)
            }
        }

        for (i in 1..red_count) { cardList.add(COLOR_RED) }
        for (i in 1..blue_count) { cardList.add(COLOR_BLUE) }
        for (i in 1..COUNT_BLACK) { cardList.add(COLOR_BLACK) }
        for (i in 1..COUNT_WHITE) { cardList.add(COLOR_WHITE) }

        cardList.shuffle()

        goalAdapter.initList(cardList)
    }

    private fun onClick() {
        binding.refreshButton.setOnClickListener {
            getRandomPosition()
        }
    }
}