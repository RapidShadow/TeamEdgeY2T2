package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }
    public void sixPage(View view){
        MediaPlayer ring = MediaPlayer.create(FiveActivity.this,R.raw.sound6);
        ring.start();
        Intent sixIntent = new Intent(this, SixActivity.class);
        startActivity(sixIntent);
    }
}