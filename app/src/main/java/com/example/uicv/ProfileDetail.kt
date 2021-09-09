package com.example.uicv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity

class ProfileDetail : AppCompatActivity() {

    private lateinit var kembali : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)

        kembali = findViewById(R.id.btn_back)
        kembali.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        // Tombol Kembali
//        val actionbar = supportActionBar
//        actionbar!!.title = "New Activity"
//        actionbar.setDisplayHomeAsUpEnabled(true)
//        actionbar.setDisplayHomeAsUpEnabled(true)
            }

    //Tombol Kembali
//    override fun onSupportNavigateUp(): Boolean {
//        return true
//    }
}