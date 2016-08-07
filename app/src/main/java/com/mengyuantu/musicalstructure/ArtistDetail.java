package com.mengyuantu.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ArtistDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_detail);

        Button shufflePlay = (Button)findViewById(R.id.shuffle_play);
        shufflePlay.setOnClickListener(new ViewNowPlaying());

        Button viewAlbum = (Button)findViewById(R.id.view_album);
        viewAlbum.setOnClickListener(new ViewAlbumDetail());
    }
}
