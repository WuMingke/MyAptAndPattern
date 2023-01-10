package com.erkuai.myaptandpattern.mvidemo

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

class MyViewModel : ViewModel() {

    private val _state = MutableSharedFlow<MainUiState>()
    val state: SharedFlow<MainUiState>
        get() = _state
}