package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()



    }


    private fun setListeners (){
        val clickableBox : List<View> = listOf(box_1,box_2,box_3,box_4,box_5,constraint_layout,red_button,yellow_button,green_button)
        for (item in clickableBox) {
            item.setOnClickListener { makeChangedColor(it) }
        }
        }

    private fun makeChangedColor(view: View) {
        when(view.id){
            R.id.box_1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_2 -> view.setBackgroundColor(Color.GRAY)


            R.id.box_3 -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_4 -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.box_5 -> view.setBackgroundResource(android.R.color.holo_purple)


            R.id.red_button -> box_3.setBackgroundResource(android.R.color.holo_red_light)
            R.id.yellow_button -> box_4.setBackgroundColor(Color.YELLOW)
            R.id.green_button -> box_5.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }
}

