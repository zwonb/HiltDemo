package com.zwonb.hiltDemo.model

import android.util.Log
import javax.inject.Inject

class Truck @Inject constructor(private val driver: Driver) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    fun deliver() {
        electricEngine.start()
        Log.i("zwonb", "deliver: Truck is delivering cargo. Driven by $driver")
        electricEngine.shutdown()
    }

}