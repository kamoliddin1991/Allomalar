package com.example.allomalar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class InfoActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent.extras?.let {
            val number = it.getInt("NUMBER")
            loadData(number)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            finish()
        }
        return true
    }

    private fun loadData(number: Int){
        val image = findViewById<ImageView>(R.id.image)
        val textTitle = findViewById<TextView>(R.id.textTitle)
        val textDescription = findViewById<TextView>(R.id.textDescription)
        when(number) {
            1 -> {
                image.setImageResource(R.drawable.al_xorazmiy)
                textTitle.text = "Al Xorazmiy"
                textDescription.setText(R.string.xorazmiy)
                setTitle("Al Xorazmiy")
            }
            2 -> {
                image.setImageResource(R.drawable.alishe_navoiy)
                textTitle.text = "Alisher Navoiy"
                textDescription.setText(R.string.navoiy)
                setTitle("Alisher Navoiy")

            }
        }

    }
}