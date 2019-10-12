package com.sematec.sematecandroidadvancedmehr98

import android.util.Log

class TestFor {


    init {
        val list = ArrayList<Int>()
        val name = "Pouya"

        for (i in name){
            println(i)
        }
        for (i in list){

        }

        for (i in 0 until 20 step 2){
            println(i)
        }

        for (i in 20 downTo 0){
            println(i)
        }

    }
}