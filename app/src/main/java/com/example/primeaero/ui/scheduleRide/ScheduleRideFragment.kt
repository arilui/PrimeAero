package com.example.primeaero.ui.scheduleRide

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.primeaero.R

class ScheduleRideFragment : Fragment() {

    //private lateinit var calendarView: CalendarView
    private lateinit var btnScheduleRide: Button

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
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_schedule_ride, container, false)
        //calendarView = view.findViewById(R.id.calendarView)
        btnScheduleRide = view.findViewById(R.id.btn_scheduleRide)

        btnScheduleRide.setOnClickListener {
            Toast.makeText(activity, "Sorry, this feature is not yet available", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}