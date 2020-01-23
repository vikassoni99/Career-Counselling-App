package com.example.careercounselling

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_test_option.*

class TestOption:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test_option)

        btn_manualTest.setOnClickListener(View.OnClickListener {

            var intent:Intent= Intent(this@TestOption,EnterName::class.java)
            startActivity(intent)

        })

        btn_chatbot.setOnClickListener(View.OnClickListener {
            var intentWeb:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://chatbot.hellotars.com/conv/NyZ3bV/"))
            startActivity(intentWeb)
        })


    }
}