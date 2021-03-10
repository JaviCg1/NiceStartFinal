package com.ramiro.ernesto.nicestart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 *
 * @version 0.1
 * @author Javic
 * @see MainActivity
 */

public class SplashScreen extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        TextView myTitle = (TextView)findViewById(R.id.textView3);
        TextView mySubtitle = (TextView)findViewById(R.id.textView4);
        ImageView myImage = (ImageView)findViewById(R.id.imageView);

//        // sets a Pretty Custom Font
//        Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
//        myTitle.setTypeface(myFont);

       // Typeface typeface = getResources().getFont(R.font.concert_one);
        //myTitle.setTypeface(typeface);

        //implements and starts animation
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.shake);
        mySubtitle.startAnimation(myanim);
        openApp(true);





    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }

}
