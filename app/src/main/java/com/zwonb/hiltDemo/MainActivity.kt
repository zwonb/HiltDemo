package com.zwonb.hiltDemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zwonb.hiltDemo.model.Truck
import com.zwonb.hiltDemo.ui.main.MainFragment
import com.zwonb.mylibrary.Lib
import com.zwonb.mylibrary2.Lib2
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
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

        lib.justDoIt()

        lib2.lib2("app call lib2")
    }
}