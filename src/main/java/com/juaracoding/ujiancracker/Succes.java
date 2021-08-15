package com.juaracoding.ujiancracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Succes extends AppCompatActivity {

    Button btnsukses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);

        btnsukses =findViewById(R.id.btnsukses);

        btnsukses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Succes.this, MainActivity.class );
                startActivity(intent);
                finish();
            }
        });
    }
}