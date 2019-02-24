package com.daima.trycatch.daima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonthSelect extends AppCompatActivity {

    public Button month1;
    public Button month2;
    public Button month3;
    public Button month4;
    public Button month5;
    public Button month6;
    public Button month7;
    public Button month8;
    public Button month9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_select);

        month1 = (Button)findViewById(R.id.button13);
        month1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month1Exercise.class);
                startActivity(homeIntent);

            }
        });

        month2 = (Button)findViewById(R.id.button12);
        month2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month2Exercise.class);
                startActivity(homeIntent);

            }
        });

        month3 = (Button)findViewById(R.id.button11);
        month3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month3Exercise.class);
                startActivity(homeIntent);

            }
        });

        month4 = (Button)findViewById(R.id.button10);
        month4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month4Exercise.class);
                startActivity(homeIntent);
            }
        });

        month5 = (Button)findViewById(R.id.button9);
        month5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month5Exercise.class);
                startActivity(homeIntent);
            }
        });

        month6 = (Button)findViewById(R.id.button8);
        month6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month6Exercise.class);
                startActivity(homeIntent);
            }
        });

        month7 = (Button)findViewById(R.id.button7);
        month7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month7Exercise.class);
                startActivity(homeIntent);
            }
        });

        month8 = (Button)findViewById(R.id.button6);
        month8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month8Exercise.class);
                startActivity(homeIntent);
            }
        });

        month9 = (Button)findViewById(R.id.button4);
        month9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MonthSelect.this, Month9Exercise.class);
                startActivity(homeIntent);
            }
        });
    }
}
