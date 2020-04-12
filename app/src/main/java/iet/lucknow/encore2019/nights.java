package iet.lucknow.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import iet.lucknow.encore2019.R;

public class nights extends AppCompatActivity {

    public CardView edm;
    public CardView band;
    public CardView standup;
    public TextView edm1;
    public TextView band1;
    public TextView standup1;
    public TextView star1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nights);

//        edm = (CardView) findViewById(R.id.edm_card);
//        edm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentLoadNewActivity= new Intent(nights.this, edm.class);
//                startActivity(intentLoadNewActivity);
//            }
//
//        });
        standup = findViewById(R.id.Standup_card);
        standup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.standup.class);
                startActivity(intentLoadNewActivity);
            }
        });
        band = findViewById(R.id.band_card);
        band.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.band.class);
                startActivity(intentLoadNewActivity);
            }
        });
        edm = findViewById(R.id.edm_card);
        edm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.edm.class);
                startActivity(intentLoadNewActivity);
            }
        });
        standup1 = findViewById(R.id.Standup);
        standup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.standup.class);
                startActivity(intentLoadNewActivity);
            }
        });
        band1 = findViewById(R.id.bike);
        band1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.band.class);
                startActivity(intentLoadNewActivity);
            }
        });
        edm1 = findViewById(R.id.edm);
        edm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(nights.this, iet.lucknow.encore2019.night.edm.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
