package com.rizfirsy.diceroll

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button?>(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() }
    }

/**
 * Roll the dice and update the screen with the result.
 */
    private fun rollDice() {
        //define the dice object
        val dice = Dice(6)
        val dice2 = Dice(12)

        //rolling the dice
        val diceRolled = dice.roll()
        val diceRolled2 = dice2.roll()

        // tell user that the dice is being rolled
        Toast.makeText(this, "2 Dice rolled!", Toast.LENGTH_SHORT).show()

        // Update the screen with the dice rolled result
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = "You got: " + (diceRolled + diceRolled2)
    }
}