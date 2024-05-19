package com.example.alvarez22102058ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btPrizes: Button = findViewById(R.id.btPrizes)
        val btTeams: Button = findViewById(R.id.btTeams)
        val btStadium: Button = findViewById(R.id.btStadium)

        btPrizes.setOnClickListener {
            val intent = Intent(this, PrizesActivity::class.java)
            startActivity(intent)

        }

        btTeams.setOnClickListener {
            val intent = Intent(this, TeamsActivity::class.java)
            startActivity(intent)

        }
        btStadium.setOnClickListener {
            val intent = Intent(this, StadiumsActivity::class.java)
            startActivity(intent)

        }
    }
}