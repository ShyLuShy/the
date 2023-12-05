package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MedicineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine)

        val textBack7: TextView = findViewById(R.id.textBack7)
        textBack7.setOnClickListener {
            val intent = Intent(this@MedicineActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}