package com.example.assignment.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.example.assignment.R

class AdminManagement : Fragment() {

    companion object {
        fun newInstance() = AdminManagement()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {


        return inflater.inflate(R.layout.admin_management, container, false)



    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Start","onViewCreated")

        view.findViewById<ImageButton>(R.id.btnViewSales).setOnClickListener {
            findNavController().navigate(R.id.action_adminManagement_to_salesSummary)
        }

        view.findViewById<ImageButton>(R.id.btnStaffInfo).setOnClickListener {
            findNavController().navigate(R.id.action_adminManagement_to_staffInfo)
        }
    }


}