package com.marvel.estudiante.taller2;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView;
        videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mControl = new MediaController(this);
        mControl.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r3---sn-vgqskn76.googlevideo.com/Cj0LENy73wIaNAkre0JvuArGORMYDSANFC0Pdr5dMOCoAUIASARg7rvWtpbrnpVdigELRG1QSU5TQzNJNjQM/E3F12E3CC0B6568559774F4BDE0854D5E37936D5.9C4B8CA342645B536807830E82D22E3D0F7E3813/yt8/1/video.3gp");
        videoView.setMediaController(mControl);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
        
    }

}

