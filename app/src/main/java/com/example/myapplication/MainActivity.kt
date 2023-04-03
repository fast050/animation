package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.transition.AutoTransition
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.transition.TransitionManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container :ConstraintLayout = findViewById(R.id.container)
        val view1 :ConstraintLayout = findViewById(R.id.box1)
        val view2 :ConstraintLayout = findViewById(R.id.box2)
        val view3 :ConstraintLayout = findViewById(R.id.box3)

        val textView1:TextView = findViewById(R.id.textBox1)
        val textView2:TextView = findViewById(R.id.textBox2)
        val textView3:TextView = findViewById(R.id.textBox3)

        val transition = AutoTransition()
        transition.duration = 500 // set the duration of the animation in milliseconds

        view1.setOnClickListener {
            textView1.visibility = if (!textView1.isVisible) View.VISIBLE else View.GONE
            TransitionManager.beginDelayedTransition(container, transition)
        }

        view2.setOnClickListener {
            textView2.visibility = if (!textView2.isVisible) View.VISIBLE else View.GONE
            TransitionManager.beginDelayedTransition(container, transition)
        }

        view3.setOnClickListener {
            textView3.visibility = if (!textView3.isVisible) View.VISIBLE else View.GONE
            TransitionManager.beginDelayedTransition(container, transition)
        }

    }
}