package com.erkuai.myaptandpattern.mvidemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    private lateinit var myViewModel: MyViewModel
    private lateinit var mBtn1: Button
    private lateinit var mBtn2: Button

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

        mBtn1.setOnClickListener {
            myViewModel.dispatch(MainIntent.refresh)
        }
    }


}