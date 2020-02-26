package com.example.kotlinwidgetview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ToastSimpan(view: View) {
        val muncul1 = Toast.makeText(application,"Berhasil", Toast.LENGTH_SHORT)
        muncul1.show()
    }


}
