package ru.mggtk.fourinrow

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class MedicineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicine)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        val textBack7: TextView = findViewById(R.id.textBack7)
        textBack7.setOnClickListener {
            val intent = Intent(this@MedicineActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}