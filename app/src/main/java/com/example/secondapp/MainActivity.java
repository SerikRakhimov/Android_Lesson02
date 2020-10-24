package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textViewMessage = (TextView) findViewById(R.id.TextMessage);
        textViewMessage.setText("Привет из Активити A!");
        Log.d("ActivityA", "С возвращением в A!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityA", "Ждем твоего возвращения в A!");
    }

    public void onClickB(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onClickC(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}