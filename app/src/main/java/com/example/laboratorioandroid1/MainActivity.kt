package com.example.laboratorioandroid1

import android.media.MediaActionSound
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }


    /**Cuando se presiona algun boton */
    fun playSound(view: View) {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(0)
    }
    fun playSound2(view: View) {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(1)
    }
    fun playSound3(view: View) {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(2)
    }
    fun playSound4(view: View) {
        val sound = MediaActionSound()
        //sound.play(MediaActionSound.START_VIDEO_RECORDING)
        sound.play(3)
    }
}
