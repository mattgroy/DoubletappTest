package com.example.doubletapptest

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SquareCountActivity : AppCompatActivity() {
    private val LOG_TAG = "SquareCountActivity"

    private lateinit var tvCfgChangeCount: TextView

    private fun animate(animation: AnimationDrawable) {
        animation.setEnterFadeDuration(10)
        animation.setExitFadeDuration(5000)
        animation.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_square_count)

        Log.d(LOG_TAG, "onCreate")

        tvCfgChangeCount = findViewById(R.id.ac_square_count_tv_cfg_change_count)
        tvCfgChangeCount.text = (intent.extras?.getInt(CFG_CHANGE_COUNT) ?: 0)
            .run { this * this }
            .toString()

        val background =
            findViewById<View>(R.id.ac_square_count_layout).background as AnimationDrawable
        animate(background)
    }

    override fun onDestroy() {
        Log.d(LOG_TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        Log.d(LOG_TAG, "onStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d(LOG_TAG, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(LOG_TAG, "onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(LOG_TAG, "onPause")
        super.onPause()
    }

    override fun onResume() {
        Log.d(LOG_TAG, "onResume")
        super.onResume()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(LOG_TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(LOG_TAG, "onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
}