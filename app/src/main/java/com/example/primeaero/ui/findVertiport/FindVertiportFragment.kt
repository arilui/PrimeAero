package com.example.primeaero.ui.findVertiport

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.primeaero.R

class FindVertiportFragment : Fragment() {

    companion object {
        fun newInstance() = FindVertiportFragment()
    }

    private val viewModel: FindVertiportViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_find_vertiport, container, false)
    }
}