package com.example.h_dice_roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "gfhfddfgbrfdgbv", Toast.LENGTH_SHORT).show()

        var rollbutton: Button = findViewById(R.id.button)


        rollbutton.setOnClickListener {
            var toast = Toast.makeText(this, "Dice rolled", Toast.LENGTH_LONG).show()
            rollDice()

        }
    }

    fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage:ImageView=findViewById(R.id.iv)

        /*val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)*/

        // Update the content description
        //diceImage.contentDescription = diceRoll.toString()
        when(diceRoll){
            1->diceImage.setImageResource(R.drawable.dice_1)
            2->diceImage.setImageResource(R.drawable.dice_2)
            3->diceImage.setImageResource(R.drawable.dice_3)
            4->diceImage.setImageResource(R.drawable.dice_4)
            5->diceImage.setImageResource(R.drawable.dice_5)
            6->diceImage.setImageResource(R.drawable.dice_6)

        }
    }

}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}