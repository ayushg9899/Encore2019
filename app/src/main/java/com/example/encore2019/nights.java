package com.example.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.encore2019.night.edm;
import com.example.encore2019.night.standup;
import com.example.encore2019.night.band;

public class nights extends AppCompatActivity {

    public CardView edm;
    public CardView band;
    public CardView standup;
    public CardView star;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nights);

//        edm = (CardView) findViewById(R.id.edm_card);
//        edm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadNewActivity= new Intent(nights.this, com.example.encore2019.night.edm.class);
//                startActivity(intentLoadNewActivity);
//            }
//
//        });
        standup = (CardView) findViewById(R.id.Standup_card);
        standup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, com.example.encore2019.night.standup.class);
                startActivity(intentLoadNewActivity);
            }
        });
        star = (CardView) findViewById(R.id.star_card);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, com.example.encore2019.night.star.class);
                startActivity(intentLoadNewActivity);
            }
        });
        band = (CardView) findViewById(R.id.band_card);
        band.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, com.example.encore2019.night.band.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
