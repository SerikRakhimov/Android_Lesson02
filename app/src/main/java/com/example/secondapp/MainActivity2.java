package com.example.secondapp;

import android.content.Intent;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window2);
    }
    @Override
    protected void onResume() {
        super.onResume();
        TextView textViewMessage = (TextView) findViewById(R.id.TextMessage);
        textViewMessage.setText("Привет из Активити B!");
        Log.d("ActivityA", "С возвращением в B!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityB", "Ждем твоего возвращения в B!");
    }

    public void onClickA(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickC(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}