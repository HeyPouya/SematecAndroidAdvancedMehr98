package com.sematec.sematecandroidadvancedmehr98

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TestObservableClass {


    fun getNumbers(): Observable<Int> {
        return Observable
            .just(1, 2, 3, 4)
            .map { it * it }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

    fun getNumber(): Int {
        return 3
    }
}