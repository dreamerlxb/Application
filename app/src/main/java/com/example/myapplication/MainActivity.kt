package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity(R.layout.main_activity) {

    private val getContent = prepareCall(ActivityResultContracts.GetContent()) { uri: Uri? ->
        // Handle the returned Uri
        Log.i("tags ","$uri")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
//        NavHostFragment
//        button.setOnClickListener {
//            getContent("image/*")
//        }
    }
}
