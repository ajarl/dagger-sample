package com.example.common

import android.content.Context

interface ComponentProvider {
    fun <T> provideComponent(clazz: Class<T>): T
}

inline fun <reified T> Context.getComponent(): T =
    (applicationContext as ComponentProvider).provideComponent(T::class.java)
