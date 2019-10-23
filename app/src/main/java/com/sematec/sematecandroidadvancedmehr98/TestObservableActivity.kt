package com.sematec.sematecandroidadvancedmehr98

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable

class TestObservableActivity : AppCompatActivity() {

    private val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_observable)


//        disposable.add(Observable
//            .just(1, 2, 3)
//            .map {
//                it * it
//                println(Thread.currentThread().name)
//            }
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                println(Thread.currentThread().name)
//                println(it)
//            }, {
//                Log.d("MYTAG", it.message)
//            }, {
//                println("Completed")
//            })
//        )


        val testObservableClass = TestObservableClass()
        disposable.add(
            testObservableClass
                .getNumbers()
                .subscribe({
                    println(it)
                }, {
                    Log.d("MYTAG", it.message)
                })
        )


    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.clear()
    }
}
