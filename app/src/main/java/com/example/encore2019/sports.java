package com.example.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.encore2019.sports_events.chess;
import com.example.encore2019.sports_events.futsal;
import com.example.encore2019.sports_events.taekwondo;
import com.example.encore2019.sports_events.carrom;
import com.example.encore2019.sports_events.table;


public class sports extends AppCompatActivity {
public CardView badminton;
public CardView futsal; 
public CardView carrom; 
public CardView taekwondo;
public CardView table;
public CardView chess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);


        badminton = (CardView) findViewById(R.id.Badminton_card);
        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.badminton.class);
                startActivity(intentLoadNewActivity);
            }

        });
        chess = (CardView) findViewById(R.id.Chess_card);
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.chess.class);
                startActivity(intentLoadNewActivity);
            }

        });
        futsal = (CardView) findViewById(R.id.futsal_card);
        futsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.futsal.class);
                startActivity(intentLoadNewActivity);
            }

        });
        carrom = (CardView) findViewById(R.id.Carrom_card);
        carrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.carrom.class);
                startActivity(intentLoadNewActivity);
            }

        });
        taekwondo = (CardView) findViewById(R.id.Taekwondo_card);
        taekwondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.taekwondo.class);
                startActivity(intentLoadNewActivity);
            }

        });
        table = (CardView) findViewById(R.id.Table_card);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(sports.this, com.example.encore2019.sports_events.table.class);
                startActivity(intentLoadNewActivity);
            }

        });
    }
}
