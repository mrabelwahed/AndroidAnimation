package com.ramadan_apps.androidanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static android.R.attr.animation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void flipOnVertical(View thumbnailView) {
        ImageView thumbnail = (ImageView)thumbnailView;
        ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);




        Animator animator
                = AnimatorInflater.loadAnimator(this, R.animator.flip_on_verticle);
        animator.setTarget(thumbnail);
        animator.start();
    }
}
