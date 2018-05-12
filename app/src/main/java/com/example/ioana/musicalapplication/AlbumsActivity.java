package com.example.ioana.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        //Create an array of albums
        final ArrayList<Albums> album = new ArrayList<Albums>();
        album.add(new Albums("25", "Adele", R.drawable.adele));
        album.add(new Albums("24k Magic", "Bruno Mars", R.drawable.bruno));
        album.add(new Albums("Dive", "Ed Sheeran", R.drawable.divide));
        album.add(new Albums("Kids in love", "Kygo", R.drawable.kids));

        AlbumsAdapter adapter = new AlbumsAdapter(this, album);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //set on click on an item in order to open a new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                if (position == 0) {
                    Intent intent = new Intent(AlbumsActivity.this, AdeleBiography.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 1) {
                    Intent intent1 = new Intent(AlbumsActivity.this, BrunoMarsBiography.class);
                    startActivityForResult(intent1, 1);
                }
                if (position == 2) {
                    Intent intent2 = new Intent(AlbumsActivity.this, EdSheeranBiography.class);
                    startActivityForResult(intent2, 2);
                }
                if (position == 3) {
                    Intent intent3 = new Intent(AlbumsActivity.this, KygoBiography.class);
                    startActivityForResult(intent3, 3);
                }
            }
        });
    }
}