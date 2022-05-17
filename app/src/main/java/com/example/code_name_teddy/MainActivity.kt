package com.example.code_name_teddy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMainFragment()
    }

    fun showMainFragment() {
        supportFragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .replace(R.id.fragment_container, MainFragment()).commit()
    }
}