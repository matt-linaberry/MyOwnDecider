package com.hasheddefines.myowndecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val gamesArray = arrayListOf("Track and Field", "NBA Hangtime", "Parodius", "Super Mario Bros.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()

            gameNameLabel.text = gamesArray[random.nextInt(gamesArray.count())]
        }

        addGameButton.setOnClickListener {
            val newGame = newGameText.text.toString()
            gamesArray.add(newGame)
        }

    }
}
