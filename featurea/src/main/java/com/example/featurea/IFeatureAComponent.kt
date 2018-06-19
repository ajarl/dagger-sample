package com.example.featurea

import javax.inject.Scope

/*
The Dagger component is declared in the app module, FeatureAComponent
 */
interface IFeatureAComponent {
    fun inject(greetingActivity: GreetingActivity)
}

@Scope
annotation class FeatureAScope