package com.bewai.Kotlin_demo_01

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv_name =  findViewById(R.id.tv_name) as TextView;
        tv_name.text = "我的世界";
        var str = aaa();
        str.indexOf("");
        tv_name.setOnClickListener {
            tv_name.text = "我的家"
        }

    }
    fun aaa():String{

        return "";
    }
}
