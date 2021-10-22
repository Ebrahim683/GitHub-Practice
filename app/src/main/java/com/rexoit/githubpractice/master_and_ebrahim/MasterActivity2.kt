package com.rexoit.githubpractice.master_and_ebrahim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rexoit.githubpractice.R
import kotlinx.android.synthetic.main.activity_master2.*

private const val TAG = "masterActivity2"
class MasterActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master2)

        Log.d(TAG, "onCreate: masterActivity2")
        val string = "This is masterActivity2"
        val number = 10
        masterActivity2(string,number)

        circleImageID.alpha = 1.0F
    }

    fun masterActivity2(string:String,number:Int){
        println(string)
        println(number)
    }

}