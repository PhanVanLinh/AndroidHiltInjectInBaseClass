package com.example.androidhilt.di

import com.example.androidhilt.api.FakeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun provideAPI(
    ): FakeApi {
        return FakeApi()
    }
}