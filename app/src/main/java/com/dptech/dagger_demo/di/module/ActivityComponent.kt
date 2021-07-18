package com.dptech.dagger_demo.di.module

import com.dptech.dagger_demo.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainActivityModule::class])
interface ActivityComponent
{
    fun inject(mainActivity : MainActivity)
}