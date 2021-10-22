package com.rexoit.githubpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "mainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: You are Ebrahim")
        Log.d(TAG, "onCreate: This is Master" + ebrahim())

        Log.d(TAG, "onCreate: I am Ebrahim")
        master()

        Log.d(TAG, "onCreate: Ebrahim 8 done")
    }

    private fun ebrahim(){
        Log.d(TAG, "ebrahim: fun Ebrahim")
    }

    private fun master(){
        Log.d(TAG, "master: I am from master fun")
    }

}