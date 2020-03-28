package com.example.thingsihate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Please Allow the sounds to finish before clicking",Toast.LENGTH_LONG).show();

    }
    public void onePage(View view){
        MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.sound1);
        ring.start();
        Intent oneIntent= new Intent(this, OneActivity.class);
        startActivity(oneIntent);
    }

}
