package com.example.citizenshipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reviewOnClick(View v){
        Intent i = new Intent(getApplicationContext(),activity_1.class);
        startActivity(i);
    }

    public void quizOnClick(View v){
        Intent i = new Intent(getApplicationContext(),activity_2_quiz.class);
        startActivity(i);
    }

}