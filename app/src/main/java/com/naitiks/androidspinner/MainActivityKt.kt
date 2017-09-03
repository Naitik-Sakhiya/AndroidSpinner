package com.naitiks.androidspinner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatSpinner
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivityKt : AppCompatActivity() {
    private val country = arrayOf("India", "USA", "UAE")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner = findViewById(R.id.my_spinner) as AppCompatSpinner
        val adapter = ArrayAdapter(this@MainActivityKt, R.layout.support_simple_spinner_dropdown_item, country)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, position: Int, l: Long) {
                Toast.makeText(this@MainActivityKt, country[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {

            }
        }
    }
}
