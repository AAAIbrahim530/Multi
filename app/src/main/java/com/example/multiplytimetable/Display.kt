package com.example.multiplytimetable

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display)

        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("numberInput")
        val number = tableString!!.toInt()
        val multiplyTable = findViewById<TextView>(R.id.textView)
        var timesdisplay: String = "$number x tables\n\n"
        //creating counter for while loop
        var count = 1
        //displaying the number the user entered on the second page next to the text x tables
        multiplyTable.text = timesdisplay

        while (count <= 20) {
            //adding a continue
            if (count == 5) {
                count++
                continue
            }
        val answer = number * count
        timesdisplay += "$number x $count = ${answer}\n"
            //increase the count
            count++
        }









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}