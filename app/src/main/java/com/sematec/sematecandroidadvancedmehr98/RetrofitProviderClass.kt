package com.sematec.sematecandroidadvancedmehr98

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProviderClass {


    companion object {

        fun provideRetrofit(): RetrofitInterface {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.aladhan.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(RetrofitInterface::class.java)
        }

    }


}