package ru.mggtk.fourinrow

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        val textBack2: TextView = findViewById(R.id.textBack2)
        textBack2.setOnClickListener {
            val intent = Intent(this@InventoryActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}