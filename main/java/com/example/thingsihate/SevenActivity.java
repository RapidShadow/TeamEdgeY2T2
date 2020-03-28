package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
    }
    public void eightPage(View view){
        MediaPlayer ring = MediaPlayer.create(SevenActivity.this,R.raw.sound8);
        ring.start();
        Intent eightIntent = new Intent(this, EightActivity.class);
        startActivity(eightIntent);
    }
}
