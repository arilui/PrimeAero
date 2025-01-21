package com.example.primeaero.ui.subscription

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.primeaero.R
import com.example.primeaero.ui.verifyaccount.VerifyAccountFragment
import com.example.primeaero.ui.managesubscription.ManageSubscriptionFragment

class SubscriptionFragment : Fragment() {

    private lateinit var tvAccountNumber: TextView
    private lateinit var btnSubscription: ImageButton
    private lateinit var btnSubscription2: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_subscription, container, false)

        tvAccountNumber = view.findViewById(R.id.tv_account_number)
        btnSubscription = view.findViewById(R.id.btn_subscription)
        btnSubscription2 = view.findViewById(R.id.btn_subscription2)

        // Display the account number
        val accountNumber = "12345678" // Retrieve this from your user data
        tvAccountNumber.text = accountNumber

        // Handle verify account button click
        btnSubscription.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.nav_host_fragment_activity_main,
                    VerifyAccountFragment()
                )
                ?.addToBackStack(null)
                ?.commit()
        }

        // Handle manage subscription button click
        btnSubscription2.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.nav_host_fragment_activity_main, ManageSubscriptionFragment())
                ?.addToBackStack(null)
                ?.commit()
        }

        return view
    }
}
