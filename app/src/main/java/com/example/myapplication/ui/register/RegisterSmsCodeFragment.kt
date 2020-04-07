package com.example.myapplication.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.myapplication.R

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterSmsCodeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterSmsCodeFragment : Fragment(R.layout.fragment_register_sms_code) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    companion object {
        @JvmStatic
        fun newInstance() = RegisterSmsCodeFragment().apply {
                arguments = Bundle()
            }
    }
}
