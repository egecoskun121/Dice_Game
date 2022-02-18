package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollTheDice=findViewById<Button>(R.id.rollthedice);
        val firstText=findViewById<TextView>(R.id.lefttext);
        val secondText=findViewById<TextView>(R.id.righttext);
        val topText=findViewById<TextView>(R.id.ToptextView);
        rollTheDice.setOnClickListener(){
            firstText.setTextColor(Color.BLACK);
            secondText.setTextColor(Color.BLACK);
            var firstDice=Random.nextInt(1,7);
            var secondDice=Random.nextInt(1,7);
            firstText.setText(firstDice.toString());
            secondText.setText(secondDice.toString());
            val lw="Left side won!!";
            val draw="DRAW!!";
            val rw="Right side won!!";


            if(firstDice>secondDice){
                firstText.setTextColor(Color.GREEN);
                topText.setText(lw.toString());

            }else if(firstDice==secondDice){
                topText.setText(draw.toString());
            }else{
                topText.setText(rw.toString());
                secondText.setTextColor(Color.GREEN);
            }

        }

        var resetButton=findViewById<Button>(R.id.reset);
        resetButton.setOnClickListener(){

            topText.setText("WHO WON ?");
            firstText.setTextColor(Color.BLACK);
            firstText.setText("-");
            secondText.setText("-");





        }



    }


}