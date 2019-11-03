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
        Uri uri = Uri.parse("rtsp://r2---sn-vgqsrnes.googlevideo.com/Cj0LENy73wIaNAkyyqKnn4frEBMYDSANFC08GL9dMOCoAUIASARgo8PL5bP6xd9digELRGwzMG56Qm9GM2sM/15B30B5265F6F93970CEE986958D7DCB1289F0CC.B5CDF5D2B92E7A70CF216D21C6A4EEAC7944B743/yt8/1/video.3gp");
        videoView.setMediaController(mControl);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }

}

