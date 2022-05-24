package com.example.code_name_teddy.play

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.example.code_name_teddy.*
import com.example.code_name_teddy.databinding.DialogSelectCardBinding
import com.example.code_name_teddy.utils.dpToPx

class SelectCardDialog(val onClicked: (Int) -> Unit): DialogFragment() {

    private lateinit var binding : DialogSelectCardBinding

    private val cardList: MutableList<CardView> by lazy {
        mutableListOf(binding.redCardView, binding.blueCardView, binding.whiteCardView, binding.blackCardView)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dialog_select_card, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        initSize()
        onClick()
    }

    private fun initSize() {
        activity?.let {
            val windowWidth = (activity as MainActivity).binding.fragmentContainer.width - dpToPx(requireContext(), 56)
            val windowHeight = (activity as MainActivity).binding.fragmentContainer.height

            cardList.forEach { cardView ->
                val layoutParams = cardView.layoutParams
                layoutParams.width = windowWidth / 5
                layoutParams.height = windowHeight / 5
                cardView.layoutParams = layoutParams
            }
        }
    }

    private fun onClick() {
        binding.redCardView.setOnClickListener {
            onClicked(COLOR_RED)
            this.dismiss()
        }
        binding.blueCardView.setOnClickListener {
            onClicked(COLOR_BLUE)
            this.dismiss()
        }
        binding.whiteCardView.setOnClickListener {
            onClicked(COLOR_WHITE)
            this.dismiss()
        }
        binding.blackCardView.setOnClickListener {
            onClicked(COLOR_BLACK)
            this.dismiss()
        }
        binding.resetButton.setOnClickListener {
            onClicked(COLOR_RESET)
            this.dismiss()
        }

        binding.closeButton.setOnClickListener {
            this.dismiss()
        }
    }
}