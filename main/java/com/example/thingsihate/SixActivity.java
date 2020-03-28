package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
    }

    public void sevenPage(View view){
        MediaPlayer ring = MediaPlayer.create(SixActivity.this,R.raw.sound7);
        ring.start();
        Intent sevenIntent = new Intent(this, SevenActivity.class);
        startActivity(sevenIntent);
    }
}
