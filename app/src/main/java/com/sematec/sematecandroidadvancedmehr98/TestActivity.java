package com.sematec.sematecandroidadvancedmehr98;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        TextView txtSample = findViewById(R.id.txtSample);
////        Person person = new Person();
//        person.setName("Qoli");
//        person.setFamily("Qolizade");
//
//
//        Log.d("PERSON", person.toString());


        FunctionUtilsKt.sum(10, 29);


        AnimalClass animal = new AnimalClass();
        DogClass dog = (DogClass) animal;

        //////////////////////////////////

        CatClass cat = new CatClass();
        AnimalClass animal1 = cat;


        txtSample.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();
    }
}
