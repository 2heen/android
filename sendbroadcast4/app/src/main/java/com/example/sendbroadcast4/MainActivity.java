package com.example.sendbroadcast4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendOutBroadcast2(View view) {
        Intent i = new Intent();
        i.setAction("com.example.sendbroadcast3");
        int [] temp = {1, 2, 3};
        i.putExtra("tempVar", temp[2]);
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}