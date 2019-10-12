package com.sematec.sematecandroidadvancedmehr98

class TestWhen {

    init {
        val fatherName: String? = null
        var age : Int? = 20


        age = null


        if (age == 20){
            println(age!!)
        }


        val sum = age + 33


        val holder: String = fatherName ?: "Undefined"
    }

}