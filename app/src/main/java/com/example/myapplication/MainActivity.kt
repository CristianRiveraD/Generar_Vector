package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var vectorTextView: TextView
    private lateinit var minTextView: TextView
    private lateinit var maxTextView: TextView
    private lateinit var averageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vectorTextView = findViewById(R.id.vectorTextView)
        minTextView = findViewById(R.id.minTextView)
        maxTextView = findViewById(R.id.maxTextView)
        averageTextView = findViewById(R.id.averageTextView)

        val generateButton: Button = findViewById(R.id.generateButton)
        generateButton.setOnClickListener {
            generateAndDisplayVector()
        }
    }

    private fun generateAndDisplayVector() {
        val vector = IntArray(10) { Random.nextInt(1, 101) }
        val vectorString = vector.joinToString(", ")

        val min = vector.minOrNull()
        val max = vector.maxOrNull()
        val average = vector.average()

        vectorTextView.text = "Vector: $vectorString"
        minTextView.text = "Mínimo: $min"
        maxTextView.text = "Máximo: $max"
        averageTextView.text = "Promedio: $average"
    }
}
