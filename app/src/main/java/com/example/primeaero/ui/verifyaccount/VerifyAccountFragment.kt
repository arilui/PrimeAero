package com.example.primeaero.ui.verifyaccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.primeaero.R

class VerifyAccountFragment : Fragment() {

    private lateinit var etEmployeeID: EditText
    private lateinit var btnSubmitID: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_verify_account, container, false)

        etEmployeeID = view.findViewById(R.id.et_employee_id)
        btnSubmitID = view.findViewById(R.id.btn_submit_id)

        btnSubmitID.setOnClickListener {
            val employeeID = etEmployeeID.text.toString().trim()
            if (isValidEmployeeID(employeeID)) {
                // Perform the necessary actions with the valid ID
                Toast.makeText(activity, "ID is valid", Toast.LENGTH_SHORT).show()
            } else {
                // Show error notification
                Toast.makeText(activity, "Invalid ID Code", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    private fun isValidEmployeeID(employeeID: String): Boolean {
        // Regex pattern to match the format 3 letters, 2 numbers, 2 letters, 4 numbers
        val pattern = "^[A-Za-z]{3}\\d{2}[A-Za-z]{2}\\d{4}$"
        return Regex(pattern).matches(employeeID)
    }
}
