package com.example.featurea

import com.example.common.AppNamer
import javax.inject.Inject

@FeatureAScope
class Greeter @Inject constructor(
    private val appNamer: AppNamer
) {
    fun greet(): String = "Hello, ${appNamer.appName}"
}