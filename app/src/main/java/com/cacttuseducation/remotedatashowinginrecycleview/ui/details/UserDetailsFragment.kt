package com.cacttuseducation.remotedatashowinginrecycleview.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentUserDetailsBinding


class UserDetailsFragment : Fragment() {

    private lateinit var binding: FragmentUserDetailsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = arguments
        val id = args?.getInt("id")
        Toast.makeText(requireContext(),"Id from home is $id",Toast.LENGTH_LONG).show()
    }
}