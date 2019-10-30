package com.sematec.sematecandroidadvancedmehr98.mvp

import android.util.Log
import io.reactivex.Observable

class TestModel(private val presenter: MVPContract.Presenter) {


    fun fetchAllNames() {
        Observable.just(arrayListOf("Ali", "Qoli", "Mamad"))
            .subscribe({
                presenter.onNamesReceived(it)
            }, {
                Log.d("MYTAG", it.message)
            })
    }
}