package com.sematec.sematecandroidadvancedmehr98

import android.util.Log

class TestLambdaClass {

    fun String.containsP(): Boolean {
        return this.contains("P") || this.contains("p")
    }

    fun div(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber / secondNumber
    }


    fun checkNames() {
        Log.d("MyTag", "Qoli : " + "Qoli".containsP())
        Log.d("MyTag", "Ali : " + "Ali".containsP().toString())
        Log.d("MyTag", "Kobra : " + "Kobra".containsP().toString())
        Log.d("MyTag", "Pouya : " + "Pouya".containsP().toString())
    }
}