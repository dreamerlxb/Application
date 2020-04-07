package com.example.myapplication.ui.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment

import com.example.myapplication.R
import kotlinx.android.synthetic.main.register_fragment.*

class RegisterFragment : DialogFragment(R.layout.register_fragment) {

    companion object {
        fun newInstance() = RegisterFragment()
    }

    private val viewModel: RegisterViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button3.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_registerFragment_to_registerSmsCodeFragment)
        }
    }
}
