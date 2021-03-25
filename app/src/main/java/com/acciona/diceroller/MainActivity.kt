package com.acciona.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.dice_image)

        val button = findViewById<Button>(R.id.rollButton)
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val random = Random(SystemClock.currentThreadTimeMillis()).nextInt(1, 7)
        image.setImageResource(when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        })
    }
}