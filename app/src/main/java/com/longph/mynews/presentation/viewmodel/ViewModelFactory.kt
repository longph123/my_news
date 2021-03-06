package com.longph.mynews.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.longph.domain.GetNewsUseCase
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class ViewModelFactory<VM : ViewModel> @Inject constructor(private val getNewsUseCase: GetNewsUseCase) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(GetNewsUseCase::class.java).newInstance(getNewsUseCase)
    }
}