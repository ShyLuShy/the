package ru.mggtk.fourinrow

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        // Переход в MainActivity
        val textBack: TextView = findViewById(R.id.textBack)
        textBack.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }

        // Переход в убежище
        val btnShelter: ImageButton = findViewById(R.id.btnShelter)
        btnShelter.setOnClickListener {
            val intent = Intent(this@MainActivity2, ShelterActivity::class.java)
            startActivity(intent)
        }

        // Переход в торговцы
        val btnTrader: ImageButton = findViewById(R.id.btnTrader)
        btnTrader.setOnClickListener {
            val intent = Intent(this@MainActivity2, TraderActivity::class.java)
            startActivity(intent)
        }

        // Переход в медицину
        val btnMedicine: ImageButton = findViewById(R.id.btnMedicine)
        btnMedicine.setOnClickListener {
            val intent = Intent(this@MainActivity2, MedicineActivity::class.java)
            startActivity(intent)
        }

        // Переход во фракции
        val btnFraction: ImageButton = findViewById(R.id.btnFraction)
        btnFraction.setOnClickListener {
            val intent = Intent(this@MainActivity2, FractionActivity::class.java)
            startActivity(intent)
        }


    }
}