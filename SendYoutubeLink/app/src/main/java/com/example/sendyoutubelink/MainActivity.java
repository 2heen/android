package com.example.sendyoutubelink;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "sendingBroadcast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view){
        Intent i = new Intent();
        i.setAction("com.example.sendbroadcast");
//        i.setType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!.txt");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
        Log.i(TAG, "BROADCAST SENT");
    }
}