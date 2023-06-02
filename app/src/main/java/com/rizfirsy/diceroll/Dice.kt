package com.rizfirsy.diceroll

class Dice(private val numSides: Int) {
    /**
    * This method will roll the dice from 1 to the user defined number.
    */
    fun roll(): Int {
        return (1..numSides).random()
    }
}