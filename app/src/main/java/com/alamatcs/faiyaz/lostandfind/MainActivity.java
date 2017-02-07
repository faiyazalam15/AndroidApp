package com.alamatcs.faiyaz.lostandfind;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabHost.TabSpec photospec = tabHost.newTabSpec("Lost");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Lost", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent photosIntent = new Intent(this, LostActivity.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabHost.TabSpec songspec = tabHost.newTabSpec("Find");
        songspec.setIndicator("Find", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent songsIntent = new Intent(this, FindActivity.class);
        songspec.setContent(songsIntent);

        // Tab for Videos
        TabSpec videospec = tabHost.newTabSpec("Add");
        videospec.setIndicator("Add", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent videosIntent = new Intent(this, AddActivity.class);
        videospec.setContent(videosIntent);


        // Tab for Videos
        TabHost.TabSpec search = tabHost.newTabSpec("Search");
        search.setIndicator("Search", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent searchIntent = new Intent(this, SearchActivity.class);
        search.setContent(searchIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab
        tabHost.addTab(search); // Adding videos tab
    }
}
