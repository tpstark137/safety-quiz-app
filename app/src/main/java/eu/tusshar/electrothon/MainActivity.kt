package eu.tusshar.electrothon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etname:EditText=findViewById(R.id.et_name)
        val btnstart :Button=findViewById(R.id.btn_start )

        btnstart.setOnClickListener {


            if(etname.text.isEmpty()){
                Toast.makeText(this,
                "Please Enter your name",Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent=Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}