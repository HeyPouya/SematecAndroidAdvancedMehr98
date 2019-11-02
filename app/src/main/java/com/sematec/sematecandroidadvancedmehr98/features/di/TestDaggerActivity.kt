package com.sematec.sematecandroidadvancedmehr98.features.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sematec.sematecandroidadvancedmehr98.R

class TestDaggerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_dagger)


        val a = DaggerAClassComponent.create().getAClass()
    }
}
