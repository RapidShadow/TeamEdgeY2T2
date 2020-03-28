package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ElevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
    }
    public void twelvePage(View view){
        MediaPlayer ring = MediaPlayer.create(ElevenActivity.this,R.raw.sound12);
        ring.start();
        Intent twelveIntent = new Intent(this, TwelveActivity.class);
        startActivity(twelveIntent);
    }
}
