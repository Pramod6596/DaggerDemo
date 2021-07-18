package com.dptech.dagger_demo.main

import androidx.lifecycle.ViewModel
import com.dptech.dagger_demo.DatabaseService
import com.dptech.dagger_demo.NetworkService
import javax.inject.Inject

class MainViewModel @Inject constructor(val databaseService: DatabaseService,val networkService: NetworkService)  {

}