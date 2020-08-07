package com.example.actionviewmap_implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            startActivity(Uri.parse(
                    "geo:0,0?q=GVK+One+Mall+-+Banjara+Hills"
            ).let {location ->
                Intent(Intent.ACTION_VIEW, location)
            })

        }
    }
}