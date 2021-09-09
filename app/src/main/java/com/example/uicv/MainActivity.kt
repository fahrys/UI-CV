package com.example.uicv

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var infodetail : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnig = findViewById<Button>(R.id.btn_ig)
        val btnwa = findViewById<Button>(R.id.btn_wa)

        btnig.setOnClickListener {
            openUrl("https://www.instagram.com/fahrisiaputra12")

        btnwa.setOnClickListener {
            openUrl2("https://api.whatsapp.com/send?phone=6285156298710")
        }}
        infodetail = findViewById(R.id.infodetail)
        infodetail.setOnClickListener {
            val intent = Intent(this , ProfileDetail::class.java)
            startActivity(intent)
        }

    }

    // Intent Ke IG
    fun openUrl(url:String) {
        val intent = Intent()
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    // Intent Ke Wa
    fun openUrl2(url:String) {
        val intent = Intent()
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}