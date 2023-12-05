package ru.mggtk.fourinrow

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import android.content.Intent
import android.os.Build
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.light_black)
        }

        // Переход в MainActivity2
        val textNext: TextView = findViewById(R.id.textNext)
        textNext.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        // Переход в AboutActivity
        val textInfo: TextView = findViewById(R.id.textInfo)
        textInfo.setOnClickListener {
           showAboutDialog(this)
        }

        // ImageButton Maps -> ResourceActivity
        val btnMaps: ImageButton = findViewById(R.id.btnMaps)
        btnMaps.setOnClickListener {
            val intent = Intent(this@MainActivity, MapsActivity::class.java)
            startActivity(intent)
        }

        // ImageButton Inventory -> ResourceActivity
        val btnInventory: ImageButton = findViewById(R.id.btnInventory)
        btnInventory.setOnClickListener {
            val intent = Intent(this@MainActivity, InventoryActivity::class.java)
            startActivity(intent)
        }

        // ImageButton Fight -> ResourceActivity
        val btnFight: ImageButton = findViewById(R.id.btnFight)
        btnFight.setOnClickListener {
            val intent = Intent(this@MainActivity, FightActivity::class.java)
            startActivity(intent)
        }

        // ImageButton Loot -> ResourceActivity
        val bthLoot: ImageButton = findViewById(R.id.bthLoot)
        bthLoot.setOnClickListener {
            val intent = Intent(this@MainActivity, LootActivity::class.java)
            startActivity(intent)
        }

    }
    private fun showAboutDialog(context: Context) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle("О программе")
        val message = "Программа разработана\n в рамках учебной практики в " +
                "МГГТК ФГБОУ ВО «АГУ» \n\n Выполнил: Ефименко Максим"
        builder.setMessage(message)

        builder.setPositiveButton("Закрыть") { dialog, which ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()

    }

}