package com.example.assignment.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyPageAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
      return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> General()
            1 -> Daily()
            else ->{
                return Monthly()
            }

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 ->  "General"
            1-> "Daily"
            else -> {
               return  "Monthly"
            }
        }
    }
}