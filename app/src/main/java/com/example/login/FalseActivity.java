package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FalseActivity extends AppCompatActivity {

    Button hint;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_false);
        hint = (Button) findViewById(R.id.btn_hint);
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FalseActivity.this, "username: user", Toast.LENGTH_SHORT).show();
                Toast.makeText(FalseActivity.this, "password: 1234", Toast.LENGTH_SHORT).show();
            }
        });
    }

}