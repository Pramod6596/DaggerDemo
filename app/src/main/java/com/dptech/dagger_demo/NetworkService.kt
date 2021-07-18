package com.dptech.dagger_demo

import android.content.Context

class NetworkService
{
    private var apiKey : String? = null
    private var context : Context? = null

    constructor( context: Context?, apiKey: String?) {
        this.apiKey = apiKey
        this.context = context
    }
}