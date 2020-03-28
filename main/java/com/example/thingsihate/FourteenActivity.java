package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FourteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
    }
    public void fifthteenPage(View view){
        MediaPlayer ring = MediaPlayer.create(FourteenActivity.this,R.raw.sound15);
        ring.start();
        Intent fifthteenIntent = new Intent(this, FiftheenActivity.class);
        startActivity(fifthteenIntent);
    }
}
