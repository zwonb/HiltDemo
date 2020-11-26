package com.zwonb.hiltDemo.main2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zwonb.hiltDemo.lib2.Lib2
import com.zwonb.hiltDemo.lib.Lib
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Main2Activity : AppCompatActivity() {

    @Inject
    lateinit var lib: Lib

    @Inject
    lateinit var lib2: Lib2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lib.justDoIt()

        lib2.lib2("start main2Activity")
    }
}