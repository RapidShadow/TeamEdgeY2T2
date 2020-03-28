package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SeventeenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeen);
    }
    public void eighteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(SeventeenActivity.this,R.raw.sound18);
        ring.start();
        Intent eighteenIntent = new Intent(this, EighteenActivity.class);
        startActivity(eighteenIntent);
    }
}
