package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsList = Constants.getQuestions()
    }
}