package com.example.tugas4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edNama = findViewById<EditText>(R.id.edNama)
        val edNim = findViewById<EditText>(R.id.edNim)
        val edAkt = findViewById<EditText>(R.id.edAkt)
        val edEmail = findViewById<EditText>(R.id.edEmail)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener({
            val nama = edNama.text.toString()
            val nim = edNim.text.toString()
            val angkatan = edAkt.text.toString()
            val email = edEmail.text.toString()

           val Intent = Intent(this, MainActivity2::class.java).also{
               it.putExtra("Nama", nama )
               it.putExtra("Nim", nim)
               it.putExtra("Angkatan", angkatan)
               it.putExtra("Email", email )
               startActivity(it)
           }
        })
    }
}