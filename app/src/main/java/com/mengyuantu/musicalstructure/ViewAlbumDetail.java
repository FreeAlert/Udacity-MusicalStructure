package com.mengyuantu.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by mengyuan on 8/7/16.
 */
public class ViewAlbumDetail implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent albumIntent = new Intent(view.getContext(),AlbumDetail.class);
            view.getContext().startActivity(albumIntent);
        }
    }

