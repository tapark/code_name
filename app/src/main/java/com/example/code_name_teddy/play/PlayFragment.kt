package com.example.code_name_teddy.play

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.code_name_teddy.MainActivity
import com.example.code_name_teddy.MainActivityViewModel
import com.example.code_name_teddy.R
import com.example.code_name_teddy.databinding.FragmentPlayBinding
import com.example.code_name_teddy.databinding.FragmentWordBinding
import com.example.code_name_teddy.goal.GoalAdapter
import com.example.code_name_teddy.utils.dpToPx

class PlayFragment: Fragment() {

    lateinit var binding: FragmentPlayBinding
    lateinit var playAdapter: PlayAdapter

    private val activityViewModel: MainActivityViewModel by lazy {
        ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory())[MainActivityViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_play, container, false)
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

            playAdapter = PlayAdapter(windowWidth, windowHeight)
            binding.playRecyclerView.adapter = playAdapter
            getRandomPosition()
        }
    }

    private fun getRandomPosition() {

    }

    private fun onClick() {
        binding.refreshButton.setOnClickListener {
            getRandomPosition()
        }
        binding.closeButton.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}