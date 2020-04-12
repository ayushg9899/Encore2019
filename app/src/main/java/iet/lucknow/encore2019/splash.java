package iet.lucknow.encore2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import iet.lucknow.encore2019.R;

public class splash extends AppCompatActivity {

    public ImageView trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

                this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageView trans = findViewById(R.id.trans);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        trans.startAnimation(animation);

        Thread timer = new Thread() {

            @Override

            public void run(){

                try {
                    sleep(4000);
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



        }
    };
        timer.start();
}
}