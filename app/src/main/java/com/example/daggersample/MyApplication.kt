package com.example.daggersample

import android.app.Application
import com.example.common.ComponentProvider
import com.example.featurea.IFeatureAComponent

class MyApplication : Application(), ComponentProvider {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }


    @Suppress("UNCHECKED_CAST")
    override fun <T> provideComponent(clazz: Class<T>): T =
        when(clazz) {
            // This is where one would implement the logical function of the scope of FeatureAScope. A typical way to do
            // it might be a refcounted instance, or some other cache. In this case we return a new component each time,
            // so theoretically the feature module could be responsible for storing this instance and keeping it around
            // for whatever it thinks the lifetime of the scope should be.
            IFeatureAComponent::class.java ->
                DaggerFeatureAComponent.builder()
                    .appComponent(appComponent)
                    .build() as T

            else -> throw IllegalArgumentException()
        }
}