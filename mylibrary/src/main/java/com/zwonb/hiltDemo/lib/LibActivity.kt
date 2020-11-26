package com.zwonb.hiltDemo.lib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibActivity : AppCompatActivity() {

    @Inject
    lateinit var lib: Lib

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lib.justDoIt()
    }
}