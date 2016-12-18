package com.zhuoxin.videonews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhuoxin.videoplayer.part.SimpleVideoPlayer;

public class MainActivity extends AppCompatActivity {
    SimpleVideoPlayer simpleVideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleVideoPlayer = (SimpleVideoPlayer) findViewById(R.id.simple_video);
        simpleVideoPlayer.setVideoPath("http://o9ve1mre2.bkt.clouddn.com/raw_%E6%B8%A9%E7%BD%91%E7%94%B7%E5%8D%95%E5%86%B3%E8%B5%9B.mp4");
    }

    @Override
    protected void onResume() {
        super.onResume();
        simpleVideoPlayer.onResuum();
    }

    @Override
    protected void onPause() {
        super.onPause();
        simpleVideoPlayer.onPause();
    }
}
