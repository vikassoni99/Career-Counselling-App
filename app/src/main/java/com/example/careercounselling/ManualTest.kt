package com.example.careercounselling

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_test.*

class ManualTest:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test)

        var intentx:Intent

        //getting name
        var namee:String=intent.getStringExtra("namePass")

        //For question
        var count:Int=1
        var qnum:String="1/20"
        var scoreScience:Double=0.0
        var scoreBio:Double=0.0
        var scoreCommerce:Double=0.0

        //putExtra
        var perS:Double
        var perB:Double
        var perC:Double

        var str_perS:String
        var str_perB:String
        var str_perC:String

        //1-10 science, 11-15 bio, 16-20 commerce

        val questionList= arrayOf("Do you find it interesting to learn chemical formulas and physics theory?",
            "Would you like to work on computers and write programs and logical codes ?",
            "Do you enjoy reading technical materials and solve technical problems ?",
            "If ever given an option would you choose given work to make a living designing equipments ?",
            "If given a task will you analyze crop yield produced from different soil and fertilizers ?",
            "Do you find it’s exciting to learn how things grow and stay alive ?",
            "Do you enjoy working in a laboratory and experimenting ?",
            "Do you find new technologies exciting and you think they are fun ?",
            "Would you like to work on projects related to technologies ?",
            "Would you like to know how your day-to-day application work ?",
            "If you have given a live tissue in a laboratory and write a research report on it would you do it ?",
            "Would you like to give polio medicine to patient in government camps ?",
            "Do you think working in a hospital or other medical facilities is a bad idea?",
            "Would you perform the task of taking care of new born in intensive care unit ?",
            "Will you do a task of giving medicine with a needle and cleaning a patient's teeth ?",
            "Would you like in taking decisions related to tax and money ?",
            "Do you have interest in analysing or deciding on investments in share markets ?",
            "Can you analyze financial information and interpret it to others ?",
            "Do you feel confident in handling other people's money and managing accounting section ?",
            "Do you find it comfortable to deal with huge set of numbers and data ?")

        txt_question.setText(questionList[0])
        txt_quesNum.setText(qnum)
        //Next Question
        btn_next.setOnClickListener(View.OnClickListener {
            btn_yes.setBackgroundResource(R.drawable.btn_bg_white)
            btn_no.setBackgroundResource(R.drawable.btn_bg_white)
            btn_maybe.setBackgroundResource(R.drawable.btn_bg_white)

            if(count==20){
                //Toast.makeText(this,"S : $scoreScience  B : $scoreBio C : $scoreCommerce ",Toast.LENGTH_SHORT).show()
                intentx=Intent(this@ManualTest,Scorecard::class.java)
                perS=(scoreScience/10)*100
                perB=(scoreBio/5)*100
                perC=(scoreCommerce/5)*100

                str_perS=perS.toString()+"%"
                str_perB=perB.toString()+"%"
                str_perC=perC.toString()+"%"

                intentx.putExtra("scoreS",perS.toString())
                intentx.putExtra("scoreB",perS.toString())
                intentx.putExtra("scoreC",perC.toString())

                intentx.putExtra("perS",str_perS)
                intentx.putExtra("perB",str_perB)
                intentx.putExtra("perC",str_perC)
                intentx.putExtra("namePass",namee.toString())
                startActivity(intentx)
            }
            else{
                txt_question.setText(questionList[count])
                qnum=(count+1).toString()+"/20"
                txt_quesNum.setText(qnum)
                count+=1
            }
        })

        //Count yes
        btn_yes.setOnClickListener(View.OnClickListener {
            btn_yes.setBackgroundResource(R.drawable.btn_bg_click)
            when(count){
                in 1..10 ->scoreScience+=1
                in 11..15 ->scoreBio+=1
                in 16..20 -> scoreCommerce+=1
            }
        })
        //Count maybe
        btn_maybe.setOnClickListener(View.OnClickListener {
            btn_maybe.setBackgroundResource(R.drawable.btn_bg_click)
            when(count){
                in 1..10 ->scoreScience+=0.5
                in 11..15 ->scoreBio+=0.5
                in 16..20 -> scoreCommerce+=0.5
            }

        })

        btn_no.setOnClickListener(View.OnClickListener {
            btn_no.setBackgroundResource(R.drawable.btn_bg_click)
            when(count){
                in 1..10 ->scoreScience+=0.0
                in 11..15 ->scoreBio+=0.0
                in 16..20 -> scoreCommerce+=0.0
            }
        })

        btn_endTest.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Test Over",Toast.LENGTH_SHORT).show()
            intentx= Intent(this@ManualTest,Scorecard::class.java)
            perS=(scoreScience/10)*100
            perB=(scoreBio/5)*100
            perC=(scoreCommerce/5)*100

            str_perS=perS.toString()+"%"
            str_perB=perB.toString()+"%"
            str_perC=perC.toString()+"%"

            var editor:SharedPreferences.Editor=getSharedPreferences("My_pref", Context.MODE_PRIVATE).edit()
            editor.putString("scoreS",perS.toString())
            editor.apply()


//
//            intentx.putExtra("scoreS",perS.toString())
//            intentx.putExtra("scoreB",perB.toString())
//            intentx.putExtra("scoreC",perC.toString())

            intentx.putExtra("perS",str_perS)
            intentx.putExtra("perB",str_perB)
            intentx.putExtra("perC",str_perC)
            intentx.putExtra("namePass",namee.toString())
            startActivity(intentx)
        })

    }
}