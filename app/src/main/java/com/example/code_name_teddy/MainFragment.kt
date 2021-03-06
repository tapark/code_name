package com.example.code_name_teddy

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.code_name_teddy.databinding.FragmentMainBinding

class MainFragment: Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        onClick()
    }

    private fun onClick() {
        binding.goalButton.setOnClickListener {
            (activity as MainActivity).showGoalFragment()
        }
        binding.wordButton.setOnClickListener {
            (activity as MainActivity).showWordFragment()
        }
        binding.playButton.setOnClickListener {
            (activity as MainActivity).showPlayFragment()
        }
    }

}