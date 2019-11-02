package com.sematec.sematecandroidadvancedmehr98.features.di

import dagger.Component

@Component(modules = [AClassModule::class])
interface AClassComponent {

    fun getAClass(): AClass
}