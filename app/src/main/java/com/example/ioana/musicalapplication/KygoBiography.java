package com.example.ioana.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KygoBiography extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kygo_biography);
        Button songsButton = findViewById(R.id.songButton);

        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open the Albums activity
                Intent albumsIntent = new Intent(KygoBiography.this, SongsActivity.class);
                // start the new activity
                startActivity(albumsIntent);
            }
        });
    }
}