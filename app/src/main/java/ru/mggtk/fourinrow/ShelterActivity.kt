package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShelterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shelter)

        val textBack8: TextView = findViewById(R.id.textBack8)
        textBack8.setOnClickListener {
            val intent = Intent(this@ShelterActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}