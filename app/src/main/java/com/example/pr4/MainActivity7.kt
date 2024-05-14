package com.example.pr4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {private lateinit var imageProgress: ImageView
    private var clickedButtonsCount = 0

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val knpka0 = findViewById<Button>(R.id.knpka0)
        val knpka1 = findViewById<Button>(R.id.knpka1)
        val knpka2 = findViewById<Button>(R.id.knpka2)
        val knpka3 = findViewById<Button>(R.id.knpka3)
        val knpka4 = findViewById<Button>(R.id.knpka4)
        val knpka5 = findViewById<Button>(R.id.knpka5)
        val knpka6 = findViewById<Button>(R.id.knpka6)
        val knpka7 = findViewById<Button>(R.id.knpka7)
        val knpka8 = findViewById<Button>(R.id.knpka8)
        val knpka9 = findViewById<Button>(R.id.knpka9)
        var index: Int = 0

        val imageArray = arrayOf(
            R.drawable.progress,
            R.drawable.progress1,
            R.drawable.progress2,R.drawable.progress3,R.drawable.progress4
        )
        imageProgress = findViewById(R.id.imageProgress)

        val clickListener = { button: Button ->
            button.setBackgroundResource(R.color.blue) // Цвет при нажатии
            index++
            imageProgress.setImageResource(imageArray[index])
            if (index >= 4) {


                val intent = Intent(this@MainActivity7, MainActivity8::class.java)
                startActivity(intent) // Переход на новое активити
            }
        }

        val releaseListener = { button: Button ->
            button.setBackgroundResource(R.color.gray) // Возвращение прежнего цвета
        }

        knpka0.setOnClickListener {
            clickListener(knpka0)
        }

        knpka0.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }

        knpka1.setOnClickListener {
            clickListener(knpka0)
        }

        knpka1.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }

        knpka2.setOnClickListener {
            clickListener(knpka0)
        }

        knpka2.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }

        knpka3.setOnClickListener {
            clickListener(knpka0)
        }

        knpka3.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }

        knpka5.setOnClickListener {
            clickListener(knpka0)
        }

        knpka5.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }
        knpka4.setOnClickListener {
            clickListener(knpka4)
        }

        knpka4.setOnTouchListener { _, _ ->
            releaseListener(knpka4)
            false
        }

        knpka6.setOnClickListener {
            clickListener(knpka0)
        }

        knpka6.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }
        knpka7.setOnClickListener {
            clickListener(knpka0)
        }

        knpka7.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }
        knpka8.setOnClickListener {
            clickListener(knpka0)
        }

        knpka8.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }
        knpka9.setOnClickListener {
            clickListener(knpka0)
        }

        knpka9.setOnTouchListener { _, _ ->
            releaseListener(knpka0)
            false
        }
    }
}