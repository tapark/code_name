package com.example.code_name_teddy.word
import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.code_name_teddy.MainActivity
import com.example.code_name_teddy.MainActivityViewModel
import com.example.code_name_teddy.R
import com.example.code_name_teddy.databinding.FragmentWordBinding

class WordFragment: Fragment() {

    lateinit var binding: FragmentWordBinding
    lateinit var wordSetAdapter: WordSetAdapter

    private var currentPage = 1

    private val activityViewModel: MainActivityViewModel by lazy {
        ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory())[MainActivityViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_word, container, false)
        binding.lifecycleOwner = this.viewLifecycleOwner
        return binding.root
    }

    @SuppressLint("SourceLockedOrientationActivity")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        initViewPager()

        onAddWord()
    }

    private fun initViewPager() {
        wordSetAdapter = WordSetAdapter{
            Thread {
                (activity as MainActivity).dbDeleteWord(currentPage, it)
            }.start()
        }.apply { initList(activityViewModel.wordSetList) }
        binding.wordSetViewPager.adapter = wordSetAdapter
        binding.wordSetViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                currentPage = position + 1
                binding.titleTextView.text = "SET $currentPage"
            }
        })
    }

    private fun onAddWord() {
        binding.addWordButton.setOnClickListener {
            val initWord = binding.addWordEditText.text.toString()
            Log.d("박태규", "initWord : $initWord")
            val initWordList = initWord.split("\n")
            initWordList.forEach {
                if (!activityViewModel.wordSetList[currentPage -1].contains(it)) {
                    activityViewModel.wordSetList[currentPage -1].add(it)
                    Thread {
                        (activity as MainActivity).dbInsertWord(currentPage, it)
                    }.start()
                }
            }
            wordSetAdapter.initList(activityViewModel.wordSetList)
            binding.addWordEditText.text.clear()
        }
    }
}