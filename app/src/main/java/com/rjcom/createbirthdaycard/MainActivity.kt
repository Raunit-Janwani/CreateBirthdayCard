package com.rjcom.createbirthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthDayFunction(view: View) {
        val nameInput=name.editableText.toString()
        Toast.makeText(this,"Hello my friend $nameInput",Toast.LENGTH_SHORT).show()
        var intent=Intent(this,BIrthdayActivity::class.java)
        intent.putExtra("name",nameInput)
        startActivity(intent)

    }
}




