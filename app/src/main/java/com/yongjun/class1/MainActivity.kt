package com.yongjun.class1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = findViewById<TextView>(R.id.textView1)
        a.text = " Yonjun"

        var b = findViewById<Button>(R.id.button)

        b.setOnClickListener {
            Log.d("button", "hello")
            a.text = "button clicked"
        }







        var imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(R.drawable.some_picture)
    }
}







//
//class Person {
//    fun breath() {
//        Log.d("breath", "211111")
//    }
//}
//
//class Yongjun: Person() {
//    override fun breath() {
//        super.breath()
//        Log.d("yongjun", "33333")
//
//    }
//
//    fun coding() {
//    }
//}