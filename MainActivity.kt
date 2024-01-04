package com.filcher2011.myfirstapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val great_text = findViewById<TextView>(R.id.text)
        val input = findViewById<EditText>(R.id.input_text)
        val btn = findViewById<Button>(R.id.button)
        val lw = findViewById<ListView>(R.id.list)

        val todos: MutableList<String> = mutableListOf()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, todos)
        lw.adapter = adapter

        btn.setOnClickListener {
            val text_user = input.text.toString().trim()
            if (text_user != "")
                adapter.insert(text_user, 0)

        }
    }
}