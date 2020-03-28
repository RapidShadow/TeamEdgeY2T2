package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FiftheenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiftheen);
    }
    public void sixteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(FiftheenActivity.this,R.raw.sound16);
        ring.start();
        Intent sixteenIntent = new Intent(this, SixteenActivity.class);
        startActivity(sixteenIntent);
    }
}
