package com.example.ioana.musicalapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private ArrayList<Songs> arrayList;
    private SongsAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        songList = (ListView) findViewById(R.id.songsList);
        arrayList = new ArrayList<>();
        arrayList.add(new Songs("Send My Love", "Adele", R.raw.adele_send_my_love));
        arrayList.add(new Songs("Hello", "Adele", R.raw.adele_hello));
        arrayList.add(new Songs("24K Magic", "Bruno Mars", R.raw.bruno_mars_24k_magic));
        arrayList.add(new Songs("Versace on the floor", "Bruno Mars", R.raw.bruno_mars_versace_on_the_floor));
        arrayList.add(new Songs("Perfect", "Ed Sheeran", R.raw.ed_sheeran_perfect));
        arrayList.add(new Songs("Happier", "Ed Sheeran", R.raw.ed_sheeran_happier));
        arrayList.add(new Songs("Kids In Love", "Kygo", R.raw.kygo_kids_in_love));
        arrayList.add(new Songs("Stranger Things", "Kygo", R.raw.kygo_stranger_things));

        adapter = new SongsAdapter(this, R.layout.list_song_items, arrayList);
        songList.setAdapter(adapter);
    }
}