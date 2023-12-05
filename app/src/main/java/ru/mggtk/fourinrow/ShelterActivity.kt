package ru.mggtk.fourinrow

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class ShelterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shelter)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        val textBack8: TextView = findViewById(R.id.textBack8)
        textBack8.setOnClickListener {
            val intent = Intent(this@ShelterActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}