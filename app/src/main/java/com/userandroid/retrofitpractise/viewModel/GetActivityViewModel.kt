package com.userandroid.retrofitpractise.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.userandroid.retrofitpractise.network.ActivityModel
import com.userandroid.retrofitpractise.repository.Repository
import kotlinx.coroutines.launch

class GetActivityViewModel(private val repository: Repository) :ViewModel(){
    val myResponse =MutableLiveData<ActivityModel>()

    fun getPost(){
        viewModelScope.launch {
            myResponse.value= repository.getActivity()
        }
    }
}