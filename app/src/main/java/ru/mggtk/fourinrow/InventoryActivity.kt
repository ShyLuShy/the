package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InventoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory)

        val textBack2: TextView = findViewById(R.id.textBack2)
        textBack2.setOnClickListener {
            val intent = Intent(this@InventoryActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}