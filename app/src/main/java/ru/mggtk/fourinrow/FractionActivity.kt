package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FractionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fraction)

        val textBack5: TextView = findViewById(R.id.textBack5)
        textBack5.setOnClickListener {
            val intent = Intent(this@FractionActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}