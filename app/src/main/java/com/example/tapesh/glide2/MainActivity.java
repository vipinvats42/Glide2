package com.example.tapesh.glide2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ProgressBar progressBar1;

    Button button;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1=(ProgressBar)findViewById(R.id.progressBar1);



        button=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView);


         button.setOnClickListener(this);
         Glide.clear(imageView);


        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {



                return false;
            }
        });

    }

@Override
    public void onClick(View view)
{
    Glide.with(this).load("").placeholder(R.drawable.a).override(800, 500).into(imageView);

}
}
