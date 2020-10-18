package com.adesoftware.fetchingstatus.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adesoftware.fetchingstatus.repository.Repository

class FetchingViewModelFactory(private val repository: Repository)
    :ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FetchingViewModel(repository) as T
    }
}