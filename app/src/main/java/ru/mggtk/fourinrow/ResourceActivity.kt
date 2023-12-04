package ru.mggtk.fourinrow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.TextView

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // ImageButton Fight -> ResourceActivity
        val txtBack: TextView = findViewById(R.id.txtBack)
        txtBack.setOnClickListener {
            val intent = Intent(this@ResourceActivity, MainActivity::class.java)
            startActivity(intent)
        }



    }
}