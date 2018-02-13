package com.example.adriana.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.play_button);
        b2 = findViewById(R.id.pause_button);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });



    }
}
