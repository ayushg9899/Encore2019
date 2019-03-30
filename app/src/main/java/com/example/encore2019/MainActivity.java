package com.example.encore2019;

import android.content.ClipData;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
  public ImageView Cultural;
  public ImageView Technical;
  public ImageView Sports;
  public ImageView Nights;
  public ImageView Arts;
  public ImageView Informal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Cultural = (ImageView) findViewById(R.id.Cultural);
        Cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, cultural.class);
            startActivity(intentLoadNewActivity);
        }

        });
        Technical = (ImageView) findViewById(R.id.Technical);
        Technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, technical.class);
                startActivity(intentLoadNewActivity);
            }

        });
        Sports = (ImageView) findViewById(R.id.Sports);
        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, sports.class);
                startActivity(intentLoadNewActivity);
            }

        });
        Nights = (ImageView) findViewById(R.id.Nights);
        Nights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, nights.class);
                startActivity(intentLoadNewActivity);
            }

        });
        Arts = (ImageView) findViewById(R.id.Arts);
        Arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, arts.class);
                startActivity(intentLoadNewActivity);
            }

        });
        Informal = (ImageView) findViewById(R.id.informal);
        Informal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, informal.class);
                startActivity(intentLoadNewActivity);
            }

        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Technical) {
            Intent i = new Intent(MainActivity.this,technical.class);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.Cultural_drawer) {
            Intent i = new Intent(MainActivity.this,cultural.class);
            startActivity(i);


        } else if (id == R.id.Sports) {
            Intent i = new Intent(MainActivity.this,sports.class);
            startActivity(i);

        } else if (id == R.id.Nights) {
            Intent i = new Intent(MainActivity.this,nights.class);
            startActivity(i);

        } else if (id == R.id.Arts) {
            Intent i = new Intent(MainActivity.this,arts.class);
            startActivity(i);

        } else if (id == R.id.About) {

        } else if (id == R.id.informal) {
            Intent i = new Intent(MainActivity.this,informal.class);
            startActivity(i);

        } else if (id == R.id.Schedule) {

        } else if (id == R.id.Contact) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
