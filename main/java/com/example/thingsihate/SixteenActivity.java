package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SixteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixteen);
    }
    public void seventeenPage(View view){
        MediaPlayer ring = MediaPlayer.create(SixteenActivity.this,R.raw.sound17);
        ring.start();
        Intent seventeenIntent = new Intent(this, SeventeenActivity.class);
        startActivity(seventeenIntent);
    }
}
