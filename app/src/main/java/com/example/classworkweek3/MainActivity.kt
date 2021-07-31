package com.example.classworkweek3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var imageOn: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.let {
            imageOn = it.getBoolean("HIDE IMAGE")
        }


        var but1 = findViewById<Button>(R.id.button1)
        var img1 = findViewById<ImageView>(R.id.imageView)

        if (imageOn) {
            img1.visibility = View.VISIBLE
            but1.text = "HIDE IMAGE"
        } else {
            img1.visibility = View.INVISIBLE
            but1.text = "SHOW IMAGE"
        }



        but1.setOnClickListener {
            if (imageOn) {
                img1.visibility = View.INVISIBLE
                but1.text = "SHOW IMAGE"
                imageOn = false
            } else {
                img1.visibility = View.VISIBLE
                but1.text = "HIDE IMAGE"
                imageOn = true
            }

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("HIDE IMAGE", imageOn)
    }
}
