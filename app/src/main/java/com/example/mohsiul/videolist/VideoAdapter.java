package com.example.mohsiul.videolist;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<Video> videoList;

    public VideoAdapter(){

    }

    public VideoAdapter(List<Video> videoList) {
        this.videoList = videoList;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_video,viewGroup,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final VideoViewHolder videoViewHolder, int i) {
        //videoViewHolder.videoweb.loadData(videoList.get(i).getVideourl(),"text/html","uft-8");
        videoViewHolder.clicked.setVisibility(View.VISIBLE);
          videoViewHolder.videoView.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
          //videoViewHolder.videoView.start();
          videoViewHolder.videoView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  videoViewHolder.videoView.start();
                  videoViewHolder.clicked.setVisibility(View.GONE);
              }
          });
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoweb;
        VideoView videoView;
        TextView clicked;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
              videoView=itemView.findViewById(R.id.videoView);
              clicked=itemView.findViewById(R.id.textClicked);
            //videoweb=(WebView)itemView.findViewById(R.id.webView);
            //videoweb.getSettings().setJavaScriptEnabled(true);
            //videoView=itemView.findViewById(R.id.videoView);
            //videoweb.setWebChromeClient( new WebChromeClient(){

            //});

        }
    }
}
