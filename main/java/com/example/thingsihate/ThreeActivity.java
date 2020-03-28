package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
    public void fourPage(View view){
        MediaPlayer ring = MediaPlayer.create(ThreeActivity.this,R.raw.sound4);
        ring.start();
        Intent fourIntent= new Intent(this, FourActivity.class);
        startActivity(fourIntent);
    }
}
