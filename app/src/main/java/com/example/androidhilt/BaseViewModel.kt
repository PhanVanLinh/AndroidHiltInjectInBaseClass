package com.example.androidhilt

import androidx.lifecycle.ViewModel
import com.example.androidhilt.api.FakeApi
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    @Inject
    protected lateinit var fakeApi: FakeApi
}