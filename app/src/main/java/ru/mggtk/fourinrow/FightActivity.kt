package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fight)

        // Переход в MainActivity
        val textBack3: TextView = findViewById(R.id.textBack3)
        textBack3.setOnClickListener {
            val intent = Intent(this@FightActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}