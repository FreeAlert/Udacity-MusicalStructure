package com.mengyuantu.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button viewTheArtist = (Button)findViewById(R.id.view_the_artist);
        viewTheArtist.setOnClickListener(new ViewArtistDetail());

        Button viewTheAlbum = (Button)findViewById(R.id.view_the_album);
        viewTheAlbum.setOnClickListener(new ViewAlbumDetail());
    }
}
