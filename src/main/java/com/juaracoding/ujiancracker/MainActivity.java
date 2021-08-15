package com.juaracoding.ujiancracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juaracoding.ujiancracker.entity.ArrayCracker;
import com.juaracoding.ujiancracker.entity.Dasboard;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_soal;
    private ArrayList<Dasboard> dasboardArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_soal = findViewById(R.id.rv_soal);
        dasboardArrayList.addAll(ArrayCracker.)
    }
}