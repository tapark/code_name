package com.example.code_name_teddy.word
import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
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
    }

    private fun initViewPager() {
        wordSetAdapter = WordSetAdapter().apply { initList(activityViewModel.wordSetList) }
        binding.wordSetViewPager.adapter = wordSetAdapter
        binding.wordSetViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.titleTextView.text = "세트 ${position + 1}"
            }
        })
    }
}