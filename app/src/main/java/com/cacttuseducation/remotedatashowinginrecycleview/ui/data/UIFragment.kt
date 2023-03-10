package com.cacttuseducation.remotedatashowinginrecycleview.ui.data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentUIBinding

class UIFragment : Fragment() {


    private lateinit var binding: FragmentUIBinding
    private val viewModel by viewModels<UIViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUIBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.uiViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }


}