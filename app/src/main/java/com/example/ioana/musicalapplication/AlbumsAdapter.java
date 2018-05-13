package com.example.ioana.musicalapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class AlbumsAdapter extends ArrayAdapter<Albums> {

    public AlbumsAdapter(Activity context, ArrayList<Albums> albums) {
        super(context, 0, albums);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_album_items, parent, false);
        }

        // Get the object located at this position in the list
        Albums currentAlbums = getItem(position);

        //TextView in the list_album_items and set the text on the name TextView
        TextView nameTextView =  listItemView.findViewById(R.id.albums_name);
        nameTextView.setText(currentAlbums.getmAlbumName());

        //TextView in the list_album_items and set the text on the name TextView
        TextView descriptionTextView = listItemView.findViewById(R.id.albums_description);
        descriptionTextView.setText(currentAlbums.getmAlbumDescription());

        //ImageView in the llist_album_items and set image on the ImageView
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAlbums.getImageResourceId());

        return listItemView;
    }

}