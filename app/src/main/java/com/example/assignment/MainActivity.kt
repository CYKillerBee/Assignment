package com.example.assignment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.example.assignment.ui.main.MyPageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {





    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
/* if (savedInstanceState == null) {
     supportFragmentManager.beginTransaction()
             .replace(R.id.container, AdminManagement.newInstance())
             .commitNow()
     }*/







     }
}