package com.example.allomalar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<FrameLayout>(R.id.itemXorazmiy).setOnClickListener { openInfo(1) }
        findViewById<FrameLayout>(R.id.itemnavoiy).setOnClickListener { openInfo(2) }
        findViewById<FrameLayout>(R.id.itembobur).setOnClickListener { openInfo(3) }
        findViewById<FrameLayout>(R.id.itemibinsino).setOnClickListener { openInfo(4) }

    }
            private fun openInfo(number: Int){
                val intent = Intent(this, InfoActivity2::class.java)
                intent.putExtra( "NUMBER", number)
                startActivity(intent)

    }
}