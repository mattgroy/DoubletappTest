package com.example.doubletapptest

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


const val CFG_CHANGE_COUNT = "CFG_CHANGE_COUNT"

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = "MainActivity"

    private var changeCount = 0

    private lateinit var tvCfgChangeCount: TextView
    private lateinit var btnContinue: Button

    private val onContinueClickListener = View.OnClickListener {
        Intent(this, SquareCountActivity::class.java)
            .putExtra(CFG_CHANGE_COUNT, changeCount)
            .run { startActivity(this) }
    }

    private fun animate(animation: AnimationDrawable) {
        animation.setEnterFadeDuration(10)
        animation.setExitFadeDuration(5000)
        animation.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)

        Log.d(LOG_TAG, "onCreate")

        tvCfgChangeCount = findViewById(R.id.ac_main_tv_cfg_change_count)
        tvCfgChangeCount.text = changeCount.toString()

        btnContinue = findViewById(R.id.ac_main_btn_continue)
        btnContinue.setOnClickListener(onContinueClickListener)

        val background = findViewById<View>(R.id.ac_main_layout).background as AnimationDrawable
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
        outState.putInt(CFG_CHANGE_COUNT, changeCount)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(LOG_TAG, "onRestoreInstanceState")
        changeCount = savedInstanceState.getInt(CFG_CHANGE_COUNT) + 1
        tvCfgChangeCount.text = changeCount.toString()
        super.onRestoreInstanceState(savedInstanceState)
    }
}