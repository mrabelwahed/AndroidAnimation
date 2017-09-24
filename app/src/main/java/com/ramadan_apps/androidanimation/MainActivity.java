package com.ramadan_apps.androidanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void imageClicked(View thumbnailView) {
        ImageView thumbnail = (ImageView)thumbnailView;
        ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);

        animatedImage.setImageDrawable(thumbnail.getDrawable());
        animatedImage.setVisibility(View.VISIBLE);

        Animation animation
                = AnimationUtils.loadAnimation(this, R.anim.scale_animation01);
        animatedImage.startAnimation(animation);
    }
}
