package com.mengyuantu.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class AlbumDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        Button playTheAlbum = (Button)findViewById(R.id.play_the_album);
        playTheAlbum.setOnClickListener(new ViewNowPlaying());

        Button viewArtistFromAlbum = (Button)findViewById(R.id.view_the_artist_from_album);
        viewArtistFromAlbum.setOnClickListener(new ViewArtistDetail());
    }
}
