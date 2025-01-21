package com.example.primeaero.ui.callUAM

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.primeaero.R
import com.example.primeaero.databinding.FragmentCallBinding

class CallFragment : Fragment() {
    private var _binding: FragmentCallBinding? = null
    private val binding get() = _binding!!
    private lateinit var callViewModel: CallViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        callViewModel = ViewModelProvider(this).get(CallViewModel::class.java)
        _binding = FragmentCallBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView: TextView = binding.textCall
        callViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}