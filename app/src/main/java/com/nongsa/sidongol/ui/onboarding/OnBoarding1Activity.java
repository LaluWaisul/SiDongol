package com.nongsa.sidongol.ui.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nongsa.sidongol.R;

public class OnBoarding1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding1);

        Button btnMove = findViewById(R.id.btnMove);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             // Perintah Intent Explicit pindah halaman ke activity_detail
              startActivity(new Intent(OnBoarding1Activity.this, OnBoarding2Activity.class));
            }
        });
    }
}