package com.example.laboratorioandroid1

import android.graphics.Color
import android.media.MediaActionSound
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.B_Do)
        val button2 = findViewById<Button>(R.id.B_Re)
        val button3 = findViewById<Button>(R.id.B_Mi)
        val button4 = findViewById<Button>(R.id.B_Fa)
        val button5 = findViewById<Button>(R.id.B_Sol)
        val button6 = findViewById<Button>(R.id.B_La)

        button1.setOnClickListener(View.OnClickListener {view ->
            changeBG(button1)
            playSong()
        })

        button2.setOnClickListener(View.OnClickListener {view ->
            changeBG(button2)
            playSound()
        })

        button3.setOnClickListener(View.OnClickListener {view ->
            changeBG(button3)
            playSound2()
        })

        button4.setOnClickListener(View.OnClickListener {view ->
            changeBG(button4)
            playSound3()
        })

        button5.setOnClickListener(View.OnClickListener {view ->
            changeBG(button5)
            playSound4()
        })

        button6.setOnClickListener(View.OnClickListener {view ->
            changeBG(button6)
            playSound2()
        })

        }

    /**Cuando se presiona algun boton */

    private fun playSound() {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(0)
    }
    private fun playSound2() {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(1)
    }
    private fun playSound3() {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(2)
    }
    private fun playSound4() {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(3)
    }

    private fun changeBG(button: Button) {
        button.setBackgroundColor(Color.RED)
    }

    private fun playSong(){
        val sound = MediaActionSound()
        sound.play(MediaActionSound.START_VIDEO_RECORDING)
    }
}
