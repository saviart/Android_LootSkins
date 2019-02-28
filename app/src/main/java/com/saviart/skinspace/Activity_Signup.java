package com.saviart.skinspace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_Signup extends AppCompatActivity {

    Button btnSignup;
    ImageView  star3,star2,star1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_signup);
        btnSignup = (Button) findViewById(R.id.btnSignup);
        star3 = (ImageView) findViewById(R.id.star3);
        star2 = (ImageView) findViewById(R.id.star2);
        star1 = (ImageView) findViewById(R.id.star1);
        Animation animstar1 = AnimationUtils.loadAnimation(this,R.anim.animstar1);
        Animation animstar3 = AnimationUtils.loadAnimation(this,R.anim.animstar2);
        Animation animstar2 = AnimationUtils.loadAnimation(this,R.anim.animstar3);

        star3.startAnimation(animstar3);
        star2.startAnimation(animstar2);
        star1.startAnimation(animstar1);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Activity_Signup.this, Activity_MainScreen.class));


            }


        });

        /// test github
    }
}
