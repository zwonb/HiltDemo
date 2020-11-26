package com.zwonb.mylibrary2

import android.util.Log
import javax.inject.Inject

class Lib2 @Inject constructor() {

    fun lib2(text: String) {
        Log.i("zwonb", "lib2: this is library2 $text")
    }

}