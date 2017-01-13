package com.wookie.orchestra.Service;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;

/**
 * Created by Wookie on 13.01.2017.
 */

public class MusicPlayerService {
    private static final String TAG="MusicPlayerService";
    public MusicPlayerService(Context context) {
        try {
            MediaPlayer mPlayer = new MediaPlayer();
            Uri myUri = Uri.parse("file://"+Environment.getExternalStorageDirectory()+"/Music/Amaranthe/2013 - The Nexus/02.Invincible.mp3");
            File sdcard = Environment.getExternalStorageDirectory();



            mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mPlayer.setDataSource(context, myUri);
            mPlayer.prepare();
            mPlayer.start();

        } catch (Exception e){
            e.printStackTrace();
            Toast toast = Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG);
            toast.show();

        }

    }

}


