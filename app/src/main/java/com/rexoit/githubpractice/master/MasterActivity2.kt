package com.rexoit.githubpractice.master

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rexoit.githubpractice.R

private const val TAG = "masterActivity2"
class MasterActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master2)

        Log.d(TAG, "onCreate: masterActivity2")
        val string = "This is masterActivity2"
        masterActivity2(string)
    }

    fun masterActivity2(string:String){
        println(string)
    }

}