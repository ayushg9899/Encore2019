package com.example.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.encore2019.technical_events.code;

public class technical extends AppCompatActivity {
public CardView code;
public CardView hunt;
public CardView roborace;
public CardView robosumo;
public CardView tech;
public CardView robosoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical);


        code = (CardView) findViewById(R.id.code_card);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.code.class);
                startActivity(intentLoadNewActivity);
            }

        });
        hunt = (CardView) findViewById(R.id.hunt_card);
        hunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.hunt.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosoc = (CardView) findViewById(R.id.robosoc_card);
        robosoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.robosoc.class);
                startActivity(intentLoadNewActivity);
            }

        });
        roborace = (CardView) findViewById(R.id.roborace_card);
        roborace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.roborace.class);
                startActivity(intentLoadNewActivity);
            }

        });
        tech = (CardView) findViewById(R.id.Tech_card);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.tech.class);
                startActivity(intentLoadNewActivity);
            }

        });
        robosumo = (CardView) findViewById(R.id.robosumo_card);
        robosumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(technical.this, com.example.encore2019.technical_events.robosumo.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
