package com.example.featurea

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.common.getComponent
import javax.inject.Inject

class GreetingActivity : AppCompatActivity() {

    @Inject
    lateinit var greeter: Greeter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        getComponent<IFeatureAComponent>().inject(this)

        findViewById<TextView>(R.id.greeting).text = greeter.greet()
    }
}
