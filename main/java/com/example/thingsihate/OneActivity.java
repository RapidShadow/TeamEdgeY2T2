package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }
    public void twoPage(View view){
        MediaPlayer ring = MediaPlayer.create(OneActivity.this,R.raw.sound2);
        ring.start();
        Intent twoIntent= new Intent(this, TwoActivity.class);
        startActivity(twoIntent);
    }
}
