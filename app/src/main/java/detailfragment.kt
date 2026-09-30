package com.example.program3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_details,
            container,
            false
        )

        val btnHome = view.findViewById<Button>(R.id.btnHome)

        btnHome.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return view
    }
}
