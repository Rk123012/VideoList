package com.example.mohsiul.videolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    Vector<Video>videos=new Vector<Video>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //videos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_q1pr3OOre0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));
        //videos.add(new Video("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5V-Zp0I96sk\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>"));

        videos.add(new Video("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        videos.add(new Video("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        videos.add(new Video("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        videos.add(new Video("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        videos.add(new Video("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));


        VideoAdapter videoAdapter=new VideoAdapter(videos);
        recyclerView.setAdapter(videoAdapter);


    }
}
