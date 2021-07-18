package com.dptech.dagger_demo.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dptech.dagger_demo.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}