package com.example.google;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GetUrlFromIntent(View view){
        String url="www.google.com";
        Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
        startActivity(i);
    }

  

}