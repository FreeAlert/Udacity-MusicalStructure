package com.mengyuantu.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by mengyuan on 8/7/16.
 */
public class ViewNowPlaying implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Intent playingIntent = new Intent(view.getContext(),NowPlaying.class);
        view.getContext().startActivity(playingIntent);
    }
}