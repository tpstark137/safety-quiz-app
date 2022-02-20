package eu.tusshar.electrothon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName:TextView=findViewById(R.id.ig_name)
        val tvScore:TextView=findViewById(R.id.ig_score)
        val btnFinish:Button=findViewById(R.id.ig_finish)

        tvName.text=intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tvScore.text="Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            Toast.makeText(this,
            "Presented By: The Error Makers!",Toast.LENGTH_LONG).show()
        }
    }
}