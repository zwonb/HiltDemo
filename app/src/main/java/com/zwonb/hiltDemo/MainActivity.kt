package com.zwonb.hiltDemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.zwonb.hiltDemo.lib.Lib
import com.zwonb.hiltDemo.lib2.Lib2
import com.zwonb.hiltDemo.lib2.Lib2Activity
import com.zwonb.hiltDemo.model.Truck
import com.zwonb.hiltDemo.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck: Truck

    @Inject
    lateinit var retrofit: Retrofit

    @Inject
    lateinit var lib: Lib

    @Inject
    lateinit var lib2: Lib2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        truck.deliver()

//        lib.justDoIt()
//
//        lib2.lib2("app call lib2")

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, Lib2Activity::class.java))
        }, 1000)
    }
}