package com.wayne.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myImage : ImageView = findViewById(R.id.imgCocktail)
        val checkFootball : CheckBox = findViewById(R.id.checkBoxFootball)
        val checkBasketball : CheckBox = findViewById(R.id.checkBoxBasketball)
        val toggleWifi : ToggleButton= findViewById(R.id.toggleButtonWifi)
        val switchDisplayMode : Switch = findViewById(R.id.switchLightMode)
        val groupGender : RadioGroup = findViewById(R.id.groupGender)

        var original = true
        myImage.setOnClickListener {
            if(original){
                myImage.setImageResource(R.drawable.wine)
                original=false
            }else{
                myImage.setImageResource(R.drawable.cocktail)
                original=true
            }

        }

        checkFootball.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this,"Football selected",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Football Not selected",Toast.LENGTH_SHORT).show()
            }
        }

        toggleWifi.setOnCheckedChangeListener{_,isTurnedOn ->
            if(isTurnedOn)
            {
                Toast.makeText(this,"WIFI is on",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"WIFI is off",Toast.LENGTH_SHORT).show()
            }
        }

        switchDisplayMode.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this,"Dark mode is on",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Dark mode is off",Toast.LENGTH_SHORT).show()
            }
        }

        groupGender.setOnCheckedChangeListener { _, id ->
            when (id) {
                R.id.radioFemale -> {
                    Toast.makeText(this,"I am female",Toast.LENGTH_SHORT).show()
                }
                R.id.radioMale -> {
                    Toast.makeText(this,"I am male",Toast.LENGTH_SHORT).show()
                }
                R.id.radioOther -> {
                    Toast.makeText(this,"I am not user about my gender",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}