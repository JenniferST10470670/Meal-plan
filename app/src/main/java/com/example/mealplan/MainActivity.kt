package com.example.mealplan

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.handleCoroutineException


class MainActivity : AppCompatActivity() {

    //
    private lateinit var suggestionTv: TextView
    private lateinit var editTextTime: EditText
    private lateinit var mealSuggestionBtn: Button
    private lateinit var resultsTv: TextView
    private lateinit var resetBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //  Associated with Xml fil through Ids

        suggestionTv = findViewById(R.id.suggestionTv)
        editTextTime = findViewById(R.id.editTextTime)
        mealSuggestionBtn = findViewById(R.id.mealSuggestionBtn)
        resultsTv = findViewById(R.id.ResultsTv)
        resetBtn = findViewById(R.id.ResetBtn)

        // initialising the if, Else statement

        val time =mealSuggestionBtn.text.toString().lowercase()
        fun mealSuggestion(){
            if (time == " Morning")
            {
                " suggestion: breakfast - (omelett with croissant)"

                if (time == " Mid-Morning")
                {
                    " suggestion: Snacks -( chia pudding)"

                } else if ( time == "'Mide-afternoon"){

                    " suggestion: Nibbles -( fruit sald "
                }

            } else if (time == " Afternoon"){
                    " suggestion : Lunch = salmon ans mix veg"

            } else if ( time == "evening"){

                " suggestion: Dinner- ( lamb curry with mashed potatoes"
                {

                }

            }







        }

























    }



}