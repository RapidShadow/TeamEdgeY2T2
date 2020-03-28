package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class EighteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteen);
    }
    public void nineteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(EighteenActivity.this,R.raw.sound19);
        ring.start();
        Intent nineteenIntent = new Intent(this, NineteenActivity.class);
        startActivity(nineteenIntent);
    }
}
