package com.example.erc20token.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Created by KATIPOGLU on 7.09.2024.
 */

open class BaseViewModel : ViewModel() {
    private val _baseState = MutableStateFlow(BaseState.None)
    val baseState= _baseState.asStateFlow()


    sealed interface BaseState{
        data object None : BaseState
    }
}
