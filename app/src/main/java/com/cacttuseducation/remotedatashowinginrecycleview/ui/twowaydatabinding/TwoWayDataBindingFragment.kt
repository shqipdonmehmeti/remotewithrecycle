package com.cacttuseducation.remotedatashowinginrecycleview.ui.twowaydatabinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentTwoWayDataBindingBinding

class TwoWayDataBindingFragment : Fragment() {
    private lateinit var binding: FragmentTwoWayDataBindingBinding
    private val viewModel by viewModels<TwoWayDataBindingViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoWayDataBindingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }

}