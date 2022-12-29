package com.cacttuseducation.remotedatashowinginrecycleview.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.cacttuseducation.remotedatashowinginrecycleview.adapter.UserAdapter
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentUserBinding
import com.cacttuseducation.remotedatashowinginrecycleview.helpers.Singletons.provideRetrofitInstance
import com.cacttuseducation.remotedatashowinginrecycleview.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserFragment : Fragment() {

    private lateinit var binding: FragmentUserBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)

        binding = FragmentUserBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        makeApiCall()
    }

    private fun makeApiCall() {
        val getUsers = provideRetrofitInstance().getAllUsers()

        getUsers.enqueue(object : Callback<UserResponse?> {
            override fun onResponse(call: Call<UserResponse?>, response: Response<UserResponse?>) {
                val listOfUsers = response.body()?.users
                val adapter = listOfUsers?.let { UserAdapter(it) }
                binding.rvUser.layoutManager = LinearLayoutManager(requireContext())
                binding.rvUser.adapter = adapter
                adapter?.setOnItemClickListener { user ->
                findNavController()
                    .navigate(UserFragmentDirections.
                    actionNavUserToUserDetailsFragment(user.id))
                }
            }

            override fun onFailure(call: Call<UserResponse?>, t: Throwable) {

            }
        })
    }

}