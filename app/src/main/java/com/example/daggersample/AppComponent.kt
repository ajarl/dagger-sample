package com.example.daggersample

import com.example.common.AppNamer
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    val appNamer: AppNamer
}

@Module
interface AppModule {
    // The app module is providing the Singleton-scoped implementation of the AppNamer interface, used by FeatureA
    @Binds
    fun bindAppNamer(appNamer: MyAppNamer): AppNamer
}
