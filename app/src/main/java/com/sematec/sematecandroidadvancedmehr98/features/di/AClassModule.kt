package com.sematec.sematecandroidadvancedmehr98.features.di

import dagger.Module
import dagger.Provides


@Module
class AClassModule {

    @Provides
    fun aClassProvider() : AClass{
        return AClass(BClass(CClass(), DClass()))
    }
}