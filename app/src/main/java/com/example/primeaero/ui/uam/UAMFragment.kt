package com.example.primeaero.ui.uam

import com.example.primeaero.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.primeaero.databinding.FragmentUamBinding


class UAMFragment : Fragment() {
    private var _binding: FragmentUamBinding? = null
    private val binding get() = _binding!!
    private lateinit var uamViewModel: UAMViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        uamViewModel = ViewModelProvider(this).get(UAMViewModel::class.java)
        _binding = FragmentUamBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textUam
        uamViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        binding.callUAM.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_call)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}