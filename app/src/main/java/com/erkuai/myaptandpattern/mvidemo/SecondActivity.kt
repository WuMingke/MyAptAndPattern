package com.erkuai.myaptandpattern.mvidemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            myViewModel.state
                .distinctUntilChanged()
                .collect {
                    when (it) {
                        is MainUiState.isLoading -> {}
                        is MainUiState.loadSuccess -> {}
                        is MainUiState.loadError -> {}
                    }
                }
        }
    }


}