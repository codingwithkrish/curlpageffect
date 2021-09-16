package com.example.curlpageeffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import app.num.numandroidpagecurleffect.PageCurlView;

public class MainActivity extends AppCompatActivity {

    PageCurlView pageCurlView ;
    List<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pageCurlView  = findViewById(R.id.pagecurl);
        list = new ArrayList<>();
        list.add(R.drawable.im1);
        list.add(R.drawable.im2);
        list.add(R.drawable.one);
        list.add(R.drawable.two);
        list.add(R.drawable.three);
        pageCurlView.setCurlView(list);
        pageCurlView.setCurlSpeed(500);


    }
}