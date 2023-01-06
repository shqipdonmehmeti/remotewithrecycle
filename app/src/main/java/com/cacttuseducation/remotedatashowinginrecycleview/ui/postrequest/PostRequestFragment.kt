package com.cacttuseducation.remotedatashowinginrecycleview.ui.postrequest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.cacttuseducation.remotedatashowinginrecycleview.databinding.FragmentPostRequestBinding
import com.cacttuseducation.remotedatashowinginrecycleview.helpers.Singletons
import com.cacttuseducation.remotedatashowinginrecycleview.model.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostRequestFragment : Fragment() {


    private lateinit var binding: FragmentPostRequestBinding
    private val viewModel by viewModels<PostRequestViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostRequestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        makeApiCalls()
    }

    private fun makeApiCalls() {
        // here 8 edit texts that we take inputs
        val product = Product(40,"Cacttus","Professional School"
            ,56,3.3,5.0,99, listOf("test","test 2", "test 3"))

        val resultOfProductsAdded = Singletons.provideRetrofitInstance().addNewProduct(product)

        resultOfProductsAdded.enqueue(object : Callback<Product?> {
            override fun onResponse(call: Call<Product?>, response: Response<Product?>) {
                Toast.makeText(requireContext(),"Result is: ${response.body()}",Toast.LENGTH_LONG).show()
            }

            override fun onFailure(call: Call<Product?>, t: Throwable) {
                Toast.makeText(requireContext(),"Error is: ${t.message}",Toast.LENGTH_LONG).show()
            }
        })

    }


}