package com.example.hw5quizapp.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.hw5quizapp.R
import kotlinx.coroutines.Dispatchers.Main


class FragmentHomescreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_homescreen, container, false)
        val nextBtn : Button = view.findViewById(R.id.Btn1)

        nextBtn.setOnClickListener{
        val intent = Intent (activity,Main::class.java)
            activity?.startActivity(intent)
        }
        return view
    }


    }
