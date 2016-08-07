package com.mengyuantu.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button recentArtist = (Button) findViewById(R.id.recent_artist);
        recentArtist.setOnClickListener(new ViewArtistDetail());

        Button recentAlbum = (Button) findViewById(R.id.recent_album);
        recentAlbum.setOnClickListener(new ViewAlbumDetail());

        Button suggestedArtist = (Button)findViewById(R.id.suggested_artist);
        suggestedArtist.setOnClickListener(new ViewArtistDetail());

        Button suggestedAlbum = (Button)findViewById(R.id.suggested_album);
        suggestedAlbum.setOnClickListener(new ViewAlbumDetail());

        Button search = (Button)findViewById(R.id.search);
        search.setOnClickListener(new ViewSearch());

        Button nowPlaying = (Button)findViewById(R.id.now_playing);
        nowPlaying.setOnClickListener(new ViewNowPlaying());
    }


}
