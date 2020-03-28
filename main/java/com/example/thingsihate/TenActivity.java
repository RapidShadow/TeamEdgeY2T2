package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class TenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
    }
    public void elevenPage(View view){
        MediaPlayer ring = MediaPlayer.create(TenActivity.this,R.raw.sound11);
        ring.start();
        Intent  elevenIntent = new Intent(this, ElevenActivity.class);
        startActivity(elevenIntent);
    }
}
