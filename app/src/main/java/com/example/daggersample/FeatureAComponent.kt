package com.example.daggersample

import com.example.featurea.FeatureAScope
import com.example.featurea.IFeatureAComponent
import dagger.Component

/*
This declares the actual functional dependency for the FeatureA component. In this case, it needs instances from
AppComponent (but it doesn't know this, it only knows that it needs some implementation of AppNamer available in the
object graph at build time).
 */
@FeatureAScope
@Component(dependencies = [AppComponent::class])
interface FeatureAComponent : IFeatureAComponent