package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class EightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
    }
    public void ninePage(View view){
        MediaPlayer ring = MediaPlayer.create(EightActivity.this,R.raw.sound9);
        ring.start();
        Intent nineIntent = new Intent(this, NineActivity.class);
        startActivity(nineIntent);
    }
}
