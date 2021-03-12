package com.example.baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAo;
    CustomAo adt;
    ArrayList<Ao> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAo = findViewById(R.id.lvAo);
        arrayList = new ArrayList<>();
        arrayList.add(new Ao("Google","80$",R.drawable.google));
        arrayList.add(new Ao("Yellow Google","120$",R.drawable.yellow_google));
        arrayList.add(new Ao("Green Google","120$",R.drawable.images));
        adt = new CustomAo(this,R.layout.item_listview,arrayList);
        lvAo.setAdapter(adt);



    }
}