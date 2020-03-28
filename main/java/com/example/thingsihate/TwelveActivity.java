package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class TwelveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
    }
    public void thirteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(TwelveActivity.this,R.raw.sound13);
        ring.start();
        Intent thirteenIntent = new Intent(this, ThirteenActivity.class);
        startActivity(thirteenIntent);
    }
}
