package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textViewMessage = (TextView) findViewById(R.id.TextMessage);
        textViewMessage.setText("Привет из Активити C!");
        Log.d("ActivityA", "С возвращением в C!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityC", "Ждем твоего возвращения в C!");
    }

    public void onClickA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickB(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}