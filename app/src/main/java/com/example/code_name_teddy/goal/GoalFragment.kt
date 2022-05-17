package com.example.code_name_teddy.goal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.FragmentGoalBinding

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
    }

    private fun initAdapter() {
        goalAdapter = GoalAdapter()
        binding.goalRecyclerView.adapter = goalAdapter
    }

    private fun getRandomPosition() {

        var cardList = mutableListOf<Int>()

        var red_count = 0
        var blue_count = 0

        when((0..1).random()) {
            0 -> { red_count = COUNT_RED + COUNT_SPY }
            1 -> { blue_count = COUNT_BLUE + COUNT_SPY }
        }

        for (i in 1..red_count) { cardList.add(COLOR_RED) }
        for (i in 1..blue_count) { cardList.add(COLOR_BLUE) }
        for (i in 1..COUNT_BLACK) { cardList.add(COLOR_BLACK) }
        for (i in 1..COUNT_WHITE) { cardList.add(COLOR_WHITE) }


    }
}