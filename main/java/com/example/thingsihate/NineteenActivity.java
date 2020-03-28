package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NineteenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteen);
    }
    public void twentyPage(View view){
        Toast.makeText(getApplicationContext(),"You Have reached the End",Toast.LENGTH_SHORT).show();
        MediaPlayer ring = MediaPlayer.create(NineteenActivity.this,R.raw.sound20);
        ring.start();
        Intent twentyIntent = new Intent(this, TwentyActivity.class);
        startActivity(twentyIntent);
    }
}
