package com.example.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.encore2019.informal_events.laser;
import com.example.encore2019.informal_events.light;
import com.example.encore2019.informal_events.pubg;
import com.example.encore2019.informal_events.turn;
import com.example.encore2019.informal_events.quest;

public class informal extends AppCompatActivity {
    public CardView laser;
    public CardView turn;
    public CardView zorb;
    public CardView light;
    public CardView pubg;
    public CardView quest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informal);


        laser = (CardView) findViewById(R.id.laser_card);
        laser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.laser.class);
                startActivity(intentLoadNewActivity);
            }

        });
        turn = (CardView) findViewById(R.id.turn_card);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.turn.class);
                startActivity(intentLoadNewActivity);
            }
        });
        zorb = (CardView) findViewById(R.id.zorb_card);
        zorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.zorb.class);
                startActivity(intentLoadNewActivity);
            }
        });
        quest = (CardView) findViewById(R.id.quest_card);
        quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.quest.class);
                startActivity(intentLoadNewActivity);
            }
        });
        light = (CardView) findViewById(R.id.light_card);
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.light.class);
                startActivity(intentLoadNewActivity);
            }
        });

        pubg = (CardView) findViewById(R.id.pubg_card);
        pubg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(informal.this, com.example.encore2019.informal_events.pubg.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
