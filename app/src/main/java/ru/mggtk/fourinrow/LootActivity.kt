package ru.mggtk.fourinrow

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class LootActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loot)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        val textBack4: TextView = findViewById(R.id.textBack4)
        textBack4.setOnClickListener {
            val intent = Intent(this@LootActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}