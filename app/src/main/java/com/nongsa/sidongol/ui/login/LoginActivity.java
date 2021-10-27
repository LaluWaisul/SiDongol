package com.nongsa.sidongol.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.nongsa.sidongol.MainActivity;
import com.nongsa.sidongol.R;
import com.nongsa.sidongol.ui.onboarding.OnBoarding1Activity;
import com.nongsa.sidongol.ui.onboarding.OnBoarding2Activity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton btnDaftar = findViewById(R.id.btnDaftar);
        Button btnMasuk = findViewById(R.id.btnMasuk);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Perintah Intent Explicit pindah halaman ke activity_detail
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Perintah Intent Explicit pindah halaman ke activity_detail
                startActivity(new Intent(LoginActivity.this, RegistrasiActivity.class));
            }
        });
    }
}