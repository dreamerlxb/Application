package com.example.myapplication.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.activity.invoke
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(R.layout.main_fragment) {

    private val getContent = prepareCall(ActivityResultContracts.GetContent()) { uri: Uri? ->
        // Handle the returned Uri
        Log.i("tags ","$uri")
    }

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            getContent("image/*")
        }

        button2.setOnClickListener {
            val nc = Navigation.findNavController(view)
            nc.navigate(R.id.action_mainFragment_to_loginFragment)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }
}
