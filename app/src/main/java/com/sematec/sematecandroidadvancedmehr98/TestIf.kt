package com.sematec.sematecandroidadvancedmehr98

import android.util.Log

class TestIf {


    init {
        val b = true
        val a = if (b) 20 else 30
    }


    fun isOdd(number: Int): Boolean {

        return if (number % 2 == 0) {
            Log.d("", "")
            //
            //
            //
            false
        } else
            true


    }

    fun isEven(number: Int) = number % 2 == 0


    fun containsP(name: String) = if (name.contains("p")) name else ""

}