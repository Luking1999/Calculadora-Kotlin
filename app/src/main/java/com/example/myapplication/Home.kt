package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.HomeBinding

class Home : Fragment() {
    private lateinit var binding : HomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = HomeBinding.inflate(inflater, container, false)

        val navController = findNavController()

        binding.button.setOnClickListener{ navController.navigate(R.id.action_home3_to_blankFragment)}

        return inflater.inflate(R.layout.home, container, false)
    }


}