package com.zwonb.mylibrary

import android.app.Application
import android.widget.Toast
import javax.inject.Inject

class Lib @Inject constructor(private val application: Application) {

    fun justDoIt() {
        Toast.makeText(application, "lib toast", Toast.LENGTH_SHORT).show()
    }
}