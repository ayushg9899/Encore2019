package com.example.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.encore2019.arts_and_literary_events.blind;
import com.example.encore2019.arts_and_literary_events.debate;
import com.example.encore2019.arts_and_literary_events.tattoo;
import com.example.encore2019.arts_and_literary_events.poetry;
import com.example.encore2019.arts_and_literary_events.talk;
import com.example.encore2019.arts_and_literary_events.dress;
import com.example.encore2019.arts_and_literary_events.live;

public class arts extends AppCompatActivity {
    
    public CardView debate;
    public CardView dress;
    public CardView lacuzzi;
    public CardView poetry;
    public CardView talk;
    public CardView tattoo;
    public CardView live;
    public CardView blind;
    public CardView clay;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);

        debate = (CardView) findViewById(R.id.debate_card);
        debate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.debate.class);
                startActivity(intentLoadNewActivity);
            }

        });
        dress = (CardView) findViewById(R.id.dress_card);
        dress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.dress.class);
                startActivity(intentLoadNewActivity);
            }
        });
        lacuzzi = (CardView) findViewById(R.id.lacuzzi_card);
        lacuzzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.lacuzzi.class);
                startActivity(intentLoadNewActivity);
            }
        });
        live = (CardView) findViewById(R.id.live_card);
        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.live.class);
                startActivity(intentLoadNewActivity);
            }
        });
        poetry = (CardView) findViewById(R.id.poetry_card);
        poetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.poetry.class);
                startActivity(intentLoadNewActivity);
            }
        });

        talk = (CardView) findViewById(R.id.talk_card);
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.talk.class);
                startActivity(intentLoadNewActivity);
            }
        });
        tattoo = (CardView) findViewById(R.id.tattoo_card);
        tattoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.tattoo.class);
                startActivity(intentLoadNewActivity);
            }
        });
        blind = (CardView) findViewById(R.id.blind_card);
        blind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.blind.class);
                startActivity(intentLoadNewActivity);
            }
        });
        clay = (CardView) findViewById(R.id.poster_card);
        clay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(arts.this, com.example.encore2019.arts_and_literary_events.clay.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
