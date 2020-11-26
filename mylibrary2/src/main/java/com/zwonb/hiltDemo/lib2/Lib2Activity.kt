package com.zwonb.hiltDemo.lib2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Lib2Activity : AppCompatActivity() {

    @Inject
    lateinit var lib2: Lib2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lib2.lib2("start Lib2Activity")
    }
}