package com.sematec.sematecandroidadvancedmehr98

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //variable
        var name = "Qoli"
        var number = 2
        var d = 2.0
        var isAlive = true
        var secondName: String = "Ali"
        var secondNumber: Int = 10

//        Int
//        Float
//        Double
//        Boolean
//        String


        name = "Mamad"


        //value
        val thirdName = ""
//        thirdName = "Manije"


        //PersonNameModel model = new PersonNameModel("","")
        val model = PersonNameModel("", "")


//        model = PersonNameModel()


        //list
        val list = ArrayList<String>()
        list.add("")
        list[0]


    }


    fun calculate() {

    }


    fun getName(): String {
        return ""
    }

    fun sum(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }


    fun sub(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber

    fun printName(name: String) = println(name)
}
