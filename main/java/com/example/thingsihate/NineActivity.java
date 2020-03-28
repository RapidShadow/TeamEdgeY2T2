package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
    }
    public void tenPage(View view){
        MediaPlayer ring = MediaPlayer.create(NineActivity.this,R.raw.sound10);
        ring.start();
        Intent tenIntent = new Intent(this, TenActivity.class);
        startActivity(tenIntent);
    }
}
