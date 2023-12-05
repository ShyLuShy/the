package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LootActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loot)

        val textBack4: TextView = findViewById(R.id.textBack4)
        textBack4.setOnClickListener {
            val intent = Intent(this@LootActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}