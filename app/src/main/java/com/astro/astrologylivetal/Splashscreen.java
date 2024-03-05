package com.astro.astrologylivetal;

//import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

@SuppressLint("CustomSplashScreen") //I don't think So
public class Splashscreen extends AppCompatActivity {
    CardView start, view;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        start = findViewById(R.id.start);
        view = findViewById(R.id.view);

        anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        view.setAnimation(anim);
        start.setAnimation(anim);

        start.setOnClickListener(v -> startActivity(new Intent(Splashscreen.this, MainActivity.class)));
    }
}