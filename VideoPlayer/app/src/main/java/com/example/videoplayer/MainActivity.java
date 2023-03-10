package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView myVid = findViewById(R.id.videoView);
        myVid.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vid);
        MediaController mediaController = new MediaController(this);
        myVid.setMediaController(mediaController);
        mediaController.setAnchorView(myVid);
        myVid.start();
    }
}