package com.rexoit.githubpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "masterActivity1"
class MasterActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master1)

        Log.d(TAG, "onCreate: ebrahim 1st commit in masterActivity1")

        //TODO EBRAHIM
    }
}