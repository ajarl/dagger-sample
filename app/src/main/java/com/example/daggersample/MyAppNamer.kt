package com.example.daggersample

import com.example.common.AppNamer
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyAppNamer @Inject constructor() : AppNamer {
    override val appName: String
        get() = "My app name"
}