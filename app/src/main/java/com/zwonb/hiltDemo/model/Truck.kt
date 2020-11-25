package com.zwonb.hiltDemo.model

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
        println("Truck is delivering cargo. Driven by $driver")
        electricEngine.shutdown()
    }

}