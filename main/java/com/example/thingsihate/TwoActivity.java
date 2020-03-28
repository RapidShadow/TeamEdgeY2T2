package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void threePage(View view){
        MediaPlayer ring = MediaPlayer.create(TwoActivity.this,R.raw.sound3);
        ring.start();
        Intent threeIntent= new Intent(this, ThreeActivity.class);
        startActivity(threeIntent);
    }
}
