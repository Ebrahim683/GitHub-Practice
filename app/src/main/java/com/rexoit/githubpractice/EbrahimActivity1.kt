package com.rexoit.githubpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

private const val TAG = "ebrahimActivity1"
class EbrahimActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebrahim1)

        Log.d(TAG, "onCreate: Ebrahim Activity 1")

        //TODO MASTER
        Log.d(TAG, "onCreate: master todo done")
        Toast.makeText(this, "master todo done", Toast.LENGTH_SHORT).show()

    }
}