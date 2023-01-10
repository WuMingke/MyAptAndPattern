package com.erkuai.myaptandpattern.mvidemo

sealed class MainUiState {
    object isLoading : MainUiState()
    data class loadError(val error: Exception) : MainUiState()
    data class loadSuccess(val rsp: Rsp) : MainUiState()
}