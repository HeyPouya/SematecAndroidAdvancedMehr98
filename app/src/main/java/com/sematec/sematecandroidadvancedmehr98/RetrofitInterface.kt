package com.sematec.sematecandroidadvancedmehr98

import com.sematec.sematecandroidadvancedmehr98.praymodel.PrayTimesClass
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("timingsByCity?method=8")
    fun getTimingsByCity(@Query("city") city: String, @Query("country") country: String): Call<PrayTimesClass>


    @GET("timingsByCity?method=8")
    fun getTimingsByCityRx(@Query("city") city: String, @Query("country") country: String): Observable<PrayTimesClass>


}