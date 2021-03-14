package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment.ui.main.AdminManagement

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, AdminManagement.newInstance())
                    .commitNow()
        }
    }
}