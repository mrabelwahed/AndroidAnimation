package com.ramadan_apps.androidanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void flipOnVertical(View  view){

        ImageView imageView = (ImageView) view;
        ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);

        Animator animator = AnimatorInflater.loadAnimator(MainActivity.this,R.animator.flip_on_verticle);
        animator.setTarget(imageView);
        animator.start();


    }
}
