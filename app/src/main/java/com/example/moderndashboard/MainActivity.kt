package com.example.moderndashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }

        val elec= findViewById<CardView>(R.id.elec)
        elec.setOnClickListener {
            val intent = Intent(this@MainActivity, ElectronicsActivity::class.java)
            startActivity(intent)
        }


        val casa= findViewById<CardView>(R.id.casa)
        casa.setOnClickListener {
            val intent = Intent(this@MainActivity,HomeActivity::class.java)
            startActivity(intent)

        }


        val Bea= findViewById<CardView>(R.id.Bea)
        Bea.setOnClickListener {
            val intent = Intent(this@MainActivity,BeautyActivity::class.java)
            startActivity(intent)
        }



        val macy= findViewById<CardView>(R.id.macy)
        macy.setOnClickListener {
            val intent = Intent(this@MainActivity,PharmacyActivity::class.java)
            startActivity(intent)
        }

        val gro= findViewById<CardView>(R.id.gro)
        gro.setOnClickListener {
            val intent = Intent(this@MainActivity,GroceriesActivity::class.java)
            startActivity(intent)
        }




    }

}


