package com.cacttuseducation.remotedatashowinginrecycleview.ui.data

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.cacttuseducation.remotedatashowinginrecycleview.R
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentUIBinding

class UIFragment : Fragment() {


    private lateinit var binding : FragmentUIBinding
    private val viewModel by viewModels<UIViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentUIBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.count.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.toString()
        }
        onBtnClickHandler()
    }



    private fun onBtnClickHandler() {
        binding.btnIncreaseBy1.setOnClickListener {
            viewModel.increaseCountBy1()
        }

        binding.btnDecreaseBy1.setOnClickListener {
            viewModel.decreaseCountBy1()
        }

        binding.btnIncreaseBy5.setOnClickListener {
            viewModel.increaseCountBy5()
        }

        binding.btnDecreaseBy5.setOnClickListener {
            viewModel.decreaseCountBy5()
        }
    }


}