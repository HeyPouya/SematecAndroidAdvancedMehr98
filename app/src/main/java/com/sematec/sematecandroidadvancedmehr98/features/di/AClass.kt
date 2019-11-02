package com.sematec.sematecandroidadvancedmehr98.features.di

import javax.inject.Inject

class AClass (val b: BClass) {

    init {
        b.someMethodsInB()
    }
}