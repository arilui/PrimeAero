package com.example.primeaero.ui.managesubscription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.primeaero.R

class ManageSubscriptionFragment : Fragment() {

    private lateinit var btnRenew: Button
    private lateinit var btnCancel: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_manage_subscription, container, false)

        btnRenew = view.findViewById(R.id.btn_renew)
        btnCancel = view.findViewById(R.id.btn_cancel)

        btnRenew.setOnClickListener {
            Toast.makeText(activity, "Sorry, this feature is not yet available", Toast.LENGTH_SHORT).show()
        }

        btnCancel.setOnClickListener {
            Toast.makeText(activity, "Sorry, this feature is not yet available", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
