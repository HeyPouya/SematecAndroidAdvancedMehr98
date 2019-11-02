package com.sematec.sematecandroidadvancedmehr98.features.di

import javax.inject.Inject


class BClass @Inject constructor(val c : CClass, val d : DClass) {

    fun someMethodsInB(){
        c.someMethodsInC()
    }
}