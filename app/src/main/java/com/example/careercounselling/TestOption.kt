package com.example.careercounselling

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_test_option.*

class TestOption:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test_option)

        btn_manualTest.setOnClickListener(View.OnClickListener {

            var intent:Intent= Intent(this@TestOption,ManualTest::class.java)
            startActivity(intent)

        })




    }
}