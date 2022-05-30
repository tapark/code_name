package com.example.code_name_teddy.play

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.code_name_teddy.MainActivity
import com.example.code_name_teddy.MainActivityViewModel
import com.example.code_name_teddy.R
import com.example.code_name_teddy.databinding.FragmentPlayBinding
import com.example.code_name_teddy.utils.dpToPx

class PlayFragment: Fragment() {

    lateinit var binding: FragmentPlayBinding
    lateinit var playAdapter: PlayAdapter
    private val checkBoxList: MutableList<ImageView> by lazy {
        mutableListOf(binding.setCheckBox1, binding.setCheckBox2, binding.setCheckBox3, binding.setCheckBox4, binding.setCheckBox5)
    }
    lateinit var currentWordSet: MutableList<String>

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

        initWordSetAdapter()
        initAdapter()
        onClick()

    }

    private fun initWordSetAdapter() {
        binding.wordSetRecyclerView1.adapter = PlayWordAdapter().apply { initList(activityViewModel.wordList1) }
        binding.wordSetRecyclerView2.adapter = PlayWordAdapter().apply { initList(activityViewModel.wordList2) }
        binding.wordSetRecyclerView3.adapter = PlayWordAdapter().apply { initList(activityViewModel.wordList3) }
        binding.wordSetRecyclerView4.adapter = PlayWordAdapter().apply { initList(activityViewModel.wordList4) }
        binding.wordSetRecyclerView5.adapter = PlayWordAdapter().apply { initList(activityViewModel.wordList5) }
    }

    private fun initAdapter() {
        activity?.let {
            val windowWidth = (activity as MainActivity).binding.fragmentContainer.width - dpToPx(requireContext(), 56)
            val windowHeight = (activity as MainActivity).binding.fragmentContainer.height

            playAdapter = PlayAdapter(windowWidth, windowHeight, this)
            binding.playRecyclerView.adapter = playAdapter
            playAdapter.initList(mutableListOf<String>())
        }
    }

    private fun getRandomPosition() {
        currentWordSet.shuffle()
        val playList = mutableListOf<String>()
        for (i in 0..24) {
            playList.add(currentWordSet[i])
        }
        playAdapter.initList(playList)
    }

    private fun onClick() {
        binding.refreshButton.setOnClickListener {
            getRandomPosition()
        }
        binding.closeButton.setOnClickListener {
            activity?.onBackPressed()
        }
        binding.closeButton2.setOnClickListener {
            activity?.onBackPressed()
        }
        binding.wordSetLayout1.setOnClickListener {
            selectWordSet(0)
        }
        binding.wordSetLayout2.setOnClickListener {
            selectWordSet(1)
        }
        binding.wordSetLayout3.setOnClickListener {
            selectWordSet(2)
        }
        binding.wordSetLayout4.setOnClickListener {
            selectWordSet(3)
        }
        binding.wordSetLayout5.setOnClickListener {
            selectWordSet(4)
        }
    }

    private fun selectWordSet(index: Int) {
        if (activityViewModel.wordSetList[index].size < 25) {
            Toast.makeText(context, "at least 25 word needed", Toast.LENGTH_SHORT).show()
            return
        }
        currentWordSet = activityViewModel.wordSetList[index]
        binding.selectLayout.visibility = View.GONE
        checkBoxList.forEachIndexed { pos, imageView ->
            if (pos == index) {
                imageView.setImageResource(R.drawable.ic_outline_check_box_24)
            } else {
                imageView.setImageResource(R.drawable.ic_round_check_box_outline_blank_24)
            }
        }
        getRandomPosition()
    }

}