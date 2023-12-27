package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int RobotCost = 35000;
    int account = 700;
    int scholarship = 1700;
    double percentPerMonth = 0.09 / 12;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView output = findViewById(R.id.MonthTextView);

        while (account < RobotCost){
            account *= 1 + percentPerMonth;
            account += scholarship;
            counter += 1;

        Log.d("Debug", "account = " + account + "\ncounter = " + counter);
        output.setText(counter + " Месяцев");

        }
    }
}