package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {
        val TAG = "Main Actvity"
        fun showMessage(msg: String) {
            Log.i(TAG, "$msg")
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
            val v = findViewById<ConstraintLayout>(R.id.mainlayout)
            if (v != null) {
                Snackbar.make(v, "$msg", Snackbar.LENGTH_LONG).show()
            }
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            showMessage("OnCreate() Method is called!")
        }

        override fun onStart() {
            super.onStart()
            showMessage("onStart() Method is called!")
        }

        override fun onResume() {
            super.onResume()
            showMessage("OnResume() Method is called!")
        }

        override fun onPause() {
            super.onPause()
            showMessage("onPause() Method is called!")
        }

        override fun onStop() {
            super.onStop()
            showMessage("OnStop() Method is called!")
        }

        override fun onDestroy() {
            super.onDestroy()
            showMessage("OnDestroy() Method is called!")
        }

        override fun onRestart() {
            super.onRestart()
            showMessage("onRestart() Method is called!")
        }
    }
}

