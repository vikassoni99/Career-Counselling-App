package com.example.careercounselling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_school.setOnClickListener(View.OnClickListener {
            var intent:Intent=Intent(this@MainActivity,TestOption::class.java);
            startActivity(intent)
        })

    }
}
