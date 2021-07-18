package com.dptech.dagger_demo

import android.content.Context

class DatabaseService
{
    private var context : Context? = null
    private var dbName : String? = null

    constructor(context: Context?, dbName: String?) {
        this.context = context
        this.dbName = dbName
    }
}