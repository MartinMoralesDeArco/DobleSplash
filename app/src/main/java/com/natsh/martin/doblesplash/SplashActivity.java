package com.natsh.martin.doblesplash;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SplashActivity extends Activity {

    private final int DURATION_SPLASH = 5000;
    Animation uptodown;
    RelativeLayout l1, l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        l1 = (RelativeLayout)findViewById(R.id.lyt_top);
        l2 = (RelativeLayout)findViewById(R.id.lyt_bottom);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        l1.setAnimation(uptodown);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, Splash2Activity.class);
                startActivity(i);
                finish();
            }
        }, DURATION_SPLASH);
    }
}
