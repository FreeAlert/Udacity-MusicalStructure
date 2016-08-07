package com.mengyuantu.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by mengyuan on 8/7/16.
 */
public class ViewArtistDetail implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        // Create a new intent to open the {@link FamilyActivity}
        Intent artistIntent = new Intent(view.getContext(), ArtistDetail.class);

        view.getContext().startActivity(artistIntent);
    }
}

