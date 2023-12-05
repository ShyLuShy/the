package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MapsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val textBack6: TextView = findViewById(R.id.textBack6)
        textBack6.setOnClickListener {
            val intent = Intent(this@MapsActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}