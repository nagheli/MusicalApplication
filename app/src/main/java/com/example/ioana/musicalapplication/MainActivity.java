package com.example.ioana.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView albums = (ImageView) findViewById(R.id.albums);
        ImageView songs = (ImageView) findViewById(R.id.songs);


        // set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // create a new intent to open the Albums activity
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                // start the new activity
                startActivity(albumsIntent);
            }
        });

        // set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // create a new intent to open the Albums activity
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                // start the new activity
                startActivity(songsIntent);
            }
        });

    }
}
