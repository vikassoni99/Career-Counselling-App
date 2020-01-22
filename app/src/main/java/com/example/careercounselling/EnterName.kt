package com.example.careercounselling

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_enter_name.*

class EnterName:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_enter_name)

        var getName=EditTxt_Name.text

        btn_start_test.setOnClickListener(View.OnClickListener {
            var intent:Intent= Intent(this@EnterName,ManualTest::class.java)
            intent.putExtra("namePass",getName.toString())
            startActivity(intent)
        })


    }
}