package com.example.primeaero.ui.scheduleRide

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.primeaero.R

class ScheduleRideFragment : Fragment() {

    companion object {
        fun newInstance() = ScheduleRideFragment()
    }

    private val viewModel: ScheduleRideViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_schedule_ride, container, false)
    }
}