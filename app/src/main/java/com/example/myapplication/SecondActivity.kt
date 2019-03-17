package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random


class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        var random = java.util.Random()
        var randomInt = 0

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        textView_random.text = Integer.toString(randomInt)
        textView_label.text = getString(R.string.random_heading, count)
    }
}
