package com.mengyuantu.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button viewArtist = (Button)findViewById(R.id.view_matched_artist);
        viewArtist.setOnClickListener(new ViewArtistDetail());

        Button viewAlbum = (Button)findViewById(R.id.view_matched_album);
        viewAlbum.setOnClickListener(new ViewAlbumDetail());
    }
}
