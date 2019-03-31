package com.example.encore2019;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.encore2019.cultural_events.dance;
import com.example.encore2019.cultural_events.skit;

public class cultural extends AppCompatActivity {
public CardView dance;
public CardView skit;
public CardView bike;
public CardView nukkad;
public CardView sing;
public CardView final_year;
public CardView vogue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);

        dance = (CardView) findViewById(R.id.dance_card);
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.dance.class);
                startActivity(intentLoadNewActivity);
            }

        });
        skit = (CardView) findViewById(R.id.skit_card);
        skit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.skit.class);
                startActivity(intentLoadNewActivity);
            }
        });
        bike = (CardView) findViewById(R.id.bike_card);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.torque.class);
                startActivity(intentLoadNewActivity);
            }
        });
        vogue = (CardView) findViewById(R.id.vogue_card);
        vogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.vogue.class);
                startActivity(intentLoadNewActivity);
            }
        });
        nukkad = (CardView) findViewById(R.id.nukkad_card);
        nukkad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.nukkad.class);
                startActivity(intentLoadNewActivity);
            }
        });

        sing = (CardView) findViewById(R.id.sing_card);
        sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.sing.class);
                startActivity(intentLoadNewActivity);
            }
        });
        final_year = (CardView) findViewById(R.id.final_card);
        final_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(cultural.this, com.example.encore2019.cultural_events.final_year.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }

    }

