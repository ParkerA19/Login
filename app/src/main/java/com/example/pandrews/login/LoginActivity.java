package com.example.pandrews.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Login successful", Toast.LENGTH_LONG).show();
    }

    public void onCancel(View view) {
        Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
    }
}
