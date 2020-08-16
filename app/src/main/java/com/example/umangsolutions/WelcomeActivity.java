package com.example.umangsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView attendeeName;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        attendeeName = findViewById(R.id.textViewAttendeeName);
        Intent intent = getIntent();
        name = intent.getStringExtra("User Name");
        attendeeName.setText("Welcome " + name);
    }
}