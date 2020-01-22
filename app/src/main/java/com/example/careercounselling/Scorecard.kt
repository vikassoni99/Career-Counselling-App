package com.example.careercounselling

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_scorecard.*

class Scorecard:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_scorecard)

        var perS:String=intent.getStringExtra("perS")
        var perB:String=intent.getStringExtra("perB")
        var perC:String=intent.getStringExtra("perC")

        var nameText:String=intent.getStringExtra("namePass")

        txt_name.setText(nameText)

        per_science.setText(perS)
        per_bio.setText(perB)
        per_commerce.setText(perC)

    }
}