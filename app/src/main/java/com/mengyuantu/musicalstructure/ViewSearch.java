package com.mengyuantu.musicalstructure;

import android.content.Intent;
import android.view.View;

/**
 * Created by mengyuan on 8/7/16.
 */
public class ViewSearch implements View.OnClickListener{
    @Override
    public void onClick(View view){
        Intent searchIntent = new Intent(view.getContext(),Search.class);
        view.getContext().startActivity(searchIntent);
    }
}
