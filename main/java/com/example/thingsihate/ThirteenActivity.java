package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ThirteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
    }
    public void fourteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(ThirteenActivity.this,R.raw.sound14);
        ring.start();
        Intent fourteenIntent = new Intent(this, FourteenActivity.class);
        startActivity(fourteenIntent);
    }
}
