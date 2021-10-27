package com.nongsa.sidongol.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.nongsa.sidongol.MainActivity;
import com.nongsa.sidongol.R;
import com.nongsa.sidongol.ui.onboarding.OnBoarding1Activity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), OnBoarding1Activity.class));
                finish();
            }
        }, 3000L); //1000 L = 1 detik

    }
}