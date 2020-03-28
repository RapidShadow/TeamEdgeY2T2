package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }
    public void fivePage(View view){
        MediaPlayer ring = MediaPlayer.create(FourActivity.this,R.raw.sound5);
        ring.start();
        Intent fiveIntent= new Intent(this, FiveActivity.class);
        startActivity(fiveIntent);
    }
}
