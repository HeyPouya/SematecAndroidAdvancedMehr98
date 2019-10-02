package com.sematec.sematecandroidadvancedmehr98;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity implements ClickInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        RecyclerView recycler = findViewById(R.id.recycler);

        ArrayList<PersonNameModel> list = new ArrayList();
        list.add(new PersonNameModel("Qoli", "Qolizade"));
        list.add(new PersonNameModel("Ali", "Alipour"));
        list.add(new PersonNameModel("Mamad", "Mamadnezhad"));
        list.add(new PersonNameModel("Sakine", "SakineKhah"));
        list.add(new PersonNameModel("Sudabe", "Sudabee"));


        TestAdapter adapter = new TestAdapter(list, this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));


    }

    @Override
    public void onRecyclerItemClicked(String family) {
        Toast.makeText(this, family, Toast.LENGTH_SHORT).show();
    }
}
