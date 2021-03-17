package com.example.assignment.ui.main

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.assignment.R
import com.google.android.material.tabs.TabLayout


class SalesSummary() : Fragment() {

    companion object {
        fun newInstance() = SalesSummary()
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sales__summary, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val salesViewPager: ViewPager = view.findViewById(R.id.viewPager)
        val fragmentAdapter=MyPageAdapter(childFragmentManager)
        salesViewPager.adapter=fragmentAdapter
        val salesTabs: TabLayout = view.findViewById(R.id.tabSalas)

        salesTabs.setupWithViewPager(salesViewPager)
    }


}