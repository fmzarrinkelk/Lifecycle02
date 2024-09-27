package edu.fullerton.fz.cs411.lifecycle02

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val LOG_TAG = "lifecycle"

class MainActivity : AppCompatActivity() {

    lateinit var increaseButton: Button
    lateinit var counterText: TextView
    var imageView: ImageView? = null

    var counterValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(LOG_TAG, "activity created")

        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.counter_text)
        increaseButton = findViewById(R.id.increase)
        increaseButton.setOnClickListener {
            counterValue += 1
            counterText.text = counterValue.toString()
        }

        imageView = findViewById(R.id.imageView)
        if (imageView != null) {
            imageView!!.animate()
        }

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            imageView = findViewById(R.id.imageView)
            imageView!!.animate()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG, "activity started")
    }
    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "activity resumed")
    }
    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "activity paused")
    }
    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "activity stopped")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "activity destroyed")
    }

}