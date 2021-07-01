package com.example.androidhilt

import com.example.androidhilt.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : BaseViewModel() {

    fun doSomeThing() {
        fakeApi.doSomeThing()
    }
}