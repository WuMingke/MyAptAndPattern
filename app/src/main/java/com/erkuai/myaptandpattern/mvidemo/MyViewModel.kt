package com.erkuai.myaptandpattern.mvidemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

/**
 * 事件管理、状态转化都放在了ViewModel中
 */
class MyViewModel : ViewModel() {

    private val _state = MutableSharedFlow<MainUiState>()
    val state: SharedFlow<MainUiState>
        get() = _state

    private val userIntent = MutableSharedFlow<MainIntent>()

    init {
        viewModelScope.launch {
            userIntent.collect {
                when (it) {
                    is MainIntent.refresh -> {}
                    is MainIntent.loadData -> {}
                    else -> {}
                }
            }
        }
    }

    fun dispatch(viewAction: MainIntent) {
        try {
            viewModelScope.launch {
                userIntent.emit(viewAction)
            }
        } catch (e: Exception) {

        }
    }
}