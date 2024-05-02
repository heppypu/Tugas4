package com.example.tugas4

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rNama = intent.getStringExtra("Nama")
        val rNim = intent.getStringExtra("Nim")
        val rAngkatan = intent.getStringExtra("Angkatan")
        val rEmail = intent.getStringExtra("Email")

        val tNama = findViewById<TextView>(R.id.nama).apply{
            text=rNama
        }
        val tNim = findViewById<TextView>(R.id.Nim).apply{
            text=rNim
        }
        val tAngkatan = findViewById<TextView>(R.id.Angkatan).apply{
            text=rAngkatan
        }
        val tEmail = findViewById<TextView>(R.id.Email).apply{
            text=rEmail
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener({
            finish()
        })
    }

}