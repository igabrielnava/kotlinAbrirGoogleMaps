package com.example.abrirgooglemaps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_id: Button

    val uri = "geo:0,0?q=mexico"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_id = findViewById<Button>(R.id.btn_id)

        btn_id.setOnClickListener {
            val urlMaps = Uri.parse(uri)
            val intentMaps = Intent(Intent.ACTION_VIEW, urlMaps)
            intentMaps.setPackage("com.google.android.apps.maps")
            if(intentMaps.resolveActivity(packageManager) != null)
                startActivity(intentMaps)

        }

    }
}