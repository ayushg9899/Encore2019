package com.example.encore2019;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.VideoView;

public class splash extends Activity {
    private boolean ispaused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Darken the status bar (optional - Create your own Utils Class)
//        MyUtils.darkenStatusBar(this, R.color.colorPrimaryDark);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        VideoView vView = (VideoView) findViewById(R.id.video_view);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                + R.raw.intro);

        if (vView != null) {
            vView.setVideoURI(video);
            vView.setZOrderOnTop(true);
            vView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });


            vView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                @Override
                public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
                    jump();
                    return false;
                }
            });

            vView.start();

        }else{

            jump();
        }
    }


    private void jump() {

        // Jump to your Next Activity or MainActivity
        Intent intent = new Intent(splash.this, MainActivity.class);
        startActivity(intent);

        splash.this.finish();

    }


    @Override
    protected void onPause() {
        super.onPause();
        ispaused = true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (ispaused) {
            jump();
        }

    }

}