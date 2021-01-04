package com.example.developer.convertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView mainImg;
    TextView welcomeText, descText;
    Button getStarted;
    Animation forImg, forButton;





    public void btnGetStartedClick(View view)
    {
        // Intent intent = new Intent(getApplicationContext(), Activity_2.class);
        //  startActivity(intent);
     //   R.id.welcomeTextt.setText("Event ocured!");
        //    finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mycode start
        mainImg =  findViewById(R.id.mainImage);
        welcomeText = findViewById(R.id.welcomeTextt);
        descText = findViewById(R.id.descTextt);
        getStarted = findViewById(R.id.btnGetStarted);

        forImg = AnimationUtils.loadAnimation(this,R.anim.forimg);
        forButton = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        mainImg.startAnimation(forImg);
        welcomeText.startAnimation(forButton);
        descText.startAnimation(forButton);
        getStarted.startAnimation(forButton);
        //mycode end

    }
}
