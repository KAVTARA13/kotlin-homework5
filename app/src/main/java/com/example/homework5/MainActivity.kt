package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2.text = "Average statistics: " +
                "\nRunning: "+App.instance.db.getStepDao().getAverageRunning()+
                "\nSwimming: "+App.instance.db.getStepDao().getAverageSwimming()+
                "\nCalories: "+App.instance.db.getStepDao().getAverageCalories()+
                "\n\nTotal "+
                "\n"+App.instance.db.getStepDao().getSumRunning()
    }

    fun saveEvent(view: View) {
        if(calories.text.isNotEmpty() && swimming.text.isNotEmpty() && mileage.text.isNotEmpty()){
            App.instance.db.getStepDao().insert(Table(0,mileage.text.toString().toDouble(),swimming.text.toString().toDouble(),calories.text.toString().toDouble()))
            Toast.makeText(applicationContext, "Data saved", Toast.LENGTH_SHORT).show()
            textView2.text = "Average statistics: " +
                    "\nRunning: "+App.instance.db.getStepDao().getAverageRunning()+
                    "\nSwimming: "+App.instance.db.getStepDao().getAverageSwimming()+
                    "\nCalories: "+App.instance.db.getStepDao().getAverageCalories()+
                    "\n\nTotal "+
                    "\n"+App.instance.db.getStepDao().getSumRunning()
        }
    }
}