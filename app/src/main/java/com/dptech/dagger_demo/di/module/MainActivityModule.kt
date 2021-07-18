package com.dptech.dagger_demo.di.module

import android.content.Context
import com.dptech.dagger_demo.DatabaseService
import com.dptech.dagger_demo.NetworkService
import com.dptech.dagger_demo.main.MainActivity
import com.dptech.dagger_demo.main.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainActivityModule(var activity : MainActivity)
{

    @Provides
    @Singleton
    fun provideMainViewModel() : MainViewModel
    {
        return MainViewModel(DatabaseService(activity,"demo"), NetworkService(activity,"apiKey"))
    }
}