package com.example.amit.kotlinoneglimps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTextValue()

        }

        fun setTextValue(value : Boolean=false): Boolean
        {
            var foodList= arrayListOf<String>("North Indian","South Indian","Dosa","Idaly","Samosa")

            bt_choose_food.setOnClickListener {

                var randomDevelop=Random();
                var randomFood=random.nextInt(foodList.count())
                tv_hello.text=foodList[randomFood];


            }
            return true
    }
}
