package com.example.careercounselling

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_scorecard.*

class Scorecard:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_scorecard)
        var pref: SharedPreferences=getSharedPreferences("My_pref", Context.MODE_PRIVATE)

        var sx:String=pref.getString("scoreS","0.0")

        var perS:String=intent.getStringExtra("perS")
        var perB:String=intent.getStringExtra("perB")
        var perC:String=intent.getStringExtra("perC")
//
//        var sx:String=intent.getStringExtra("scoreS")
//        var bx:String=intent.getStringExtra("scoreB")
//        var cx:String=intent.getStringExtra("scoreC")
        //var s:String=intent.getStringExtra("scoreS")
//        var b:Double=bx.toDouble()
//        var c:Double=cx.toDouble()

        var nameText:String=intent.getStringExtra("namePass")

        //Toast.makeText(this,"score aya h $sx ",Toast.LENGTH_SHORT).show()
        emojiScience.setImageResource(R.drawable.ic_smile)
        emojiBio.setImageResource(R.drawable.ic_bad)
        emojiCommerce.setImageResource(R.drawable.ic_bad)

        //setting emojis
        /*if(s>b && s>c){
            //s
            emojiScience.setImageResource(R.drawable.ic_smile)
            emojiBio.setImageResource(R.drawable.ic_bad)
            emojiCommerce.setImageResource(R.drawable.ic_bad)
        }else if(b>s && b>c){
            //c
            emojiBio.setImageResource(R.drawable.ic_smile)
            emojiScience.setImageResource(R.drawable.ic_bad)
            emojiCommerce.setImageResource(R.drawable.ic_bad)
        }else if(c>s && c>b){
            //c
            emojiCommerce.setImageResource(R.drawable.ic_smile)
            emojiScience.setImageResource(R.drawable.ic_bad)
            emojiBio.setImageResource(R.drawable.ic_bad)
        }
*/

        //setting text
        txt_name.setText(nameText)

        per_science.setText(perS)
        per_bio.setText(perB)
        per_commerce.setText(perC)

    }
}