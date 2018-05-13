package com.example.ioana.musicalapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Songs> arrayList;
    private MediaPlayer mediaPlayer;
    private Boolean flag = true;

    public SongsAdapter(Context context, int layout, ArrayList<Songs> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView songName, singerName;
        ImageView play, stop;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout, null);
            viewHolder.songName = convertView.findViewById(R.id.songName);
            viewHolder.singerName = convertView.findViewById(R.id.singerName);
            viewHolder.play = convertView.findViewById(R.id.play);
            viewHolder.stop = convertView.findViewById(R.id.stop);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Songs music = arrayList.get(position);

        viewHolder.songName.setText(music.getName());
        viewHolder.singerName.setText(music.getSinger());

        // play music
        viewHolder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    mediaPlayer = MediaPlayer.create(context, music.getSong());
                    flag = false;
                }
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    viewHolder.play.setImageResource(R.drawable.play);
                } else {
                    mediaPlayer.start();
                    viewHolder.play.setImageResource(R.drawable.pause);
                }
            }
        });

        // stop
        viewHolder.stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    flag = true;
                }
                viewHolder.play.setImageResource(R.drawable.play);
            }
        });

        return convertView;
    }
}
