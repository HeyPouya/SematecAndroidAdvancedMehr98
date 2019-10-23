package com.sematec.sematecandroidadvancedmehr98

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sematec.sematecandroidadvancedmehr98.praymodel.PrayTimesClass
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TestRetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit)


//        RetrofitProviderClass.provideRetrofit().getTimingsByCity("Tehran","Iran")
//            .enqueue(object : Callback<PrayTimesClass> {
//                override fun onFailure(call: Call<PrayTimesClass>, t: Throwable) {
//                    Toast.makeText(this@TestRetrofitActivity, "Failed : ${t.message}", Toast.LENGTH_LONG).show()
//
//                }
//
//                override fun onResponse(
//                    call: Call<PrayTimesClass>,
//                    response: Response<PrayTimesClass>
//                ) {
//                    Toast.makeText(this@TestRetrofitActivity, "Isha : ${response.body()?.data?.timings?.isha}", Toast.LENGTH_LONG).show()
//
//
//                }
//
//            })
//




        RetrofitProviderClass
            .provideRetrofit()
            .getTimingsByCityRx("Tehran","Iran")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Toast.makeText(this, "Isha : ${it.data.timings.isha}", Toast.LENGTH_LONG).show()
            },{
                Toast.makeText(this, "Failed : ${it.message}", Toast.LENGTH_LONG).show()
            })

    }



}
