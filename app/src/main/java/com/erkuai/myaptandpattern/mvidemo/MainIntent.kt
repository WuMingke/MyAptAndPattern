package com.erkuai.myaptandpattern.mvidemo

sealed class MainIntent {
    object refresh : MainIntent()
    object loadData : MainIntent()
}
