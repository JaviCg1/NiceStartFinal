package com.ramiro.ernesto.nicestart;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class MainActivity2  extends AppCompatActivity {
    private ImageView ivImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivImg = (ImageView) findViewById(R.id.imageView2);


        Glide.with(this)
                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .apply(new RequestOptions()
//                     .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorAccent)))
                .transition(DrawableTransitionOptions.withCrossFade(1000))
//                )
                .into(ivImg);

    }

}
