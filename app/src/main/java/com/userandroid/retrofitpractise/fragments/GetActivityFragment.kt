package com.userandroid.retrofitpractise.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.userandroid.retrofitpractise.R
import com.userandroid.retrofitpractise.databinding.FragmentGetActivityBinding
import com.userandroid.retrofitpractise.repository.Repository
import com.userandroid.retrofitpractise.viewModel.GetActivityViewModel
import com.userandroid.retrofitpractise.viewModel.GetActivityViewModelFactory

class GetActivityFragment : Fragment() {

    private lateinit var viewModel: GetActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("GetActivity","noldu")
        val binding=FragmentGetActivityBinding.inflate(layoutInflater)
        val repository=Repository()
        val viewModelFactory=GetActivityViewModelFactory(repository)
        viewModel =ViewModelProvider(this,viewModelFactory).get(GetActivityViewModel::class.java)

        viewModel.getPost()
        viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
            binding.apply {
               activity.text="Activity: ${response.activity}"
               type.text="Type: ${response.type}"
               participants.text="Participants: ${response.participants.toString()}"
               price.text="Price: ${response.price.toString()}"
            }
        })

        return binding.root
    }

}