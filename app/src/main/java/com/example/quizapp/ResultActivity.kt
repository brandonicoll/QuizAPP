package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username

        val correct = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        val questions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        tv_score.text = "Your Score is $correct out of $questions"
    }
}