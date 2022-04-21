package com.userandroid.retrofitpractise.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.userandroid.retrofitpractise.repository.Repository

class GetActivityViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory  {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GetActivityViewModel(repository) as T
    }


}