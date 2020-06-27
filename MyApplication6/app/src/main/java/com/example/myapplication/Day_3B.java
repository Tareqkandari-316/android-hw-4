package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.myapplication.R;


public class Day_3B extends AppCompatActivity {
    Button back;

    @SuppressLint({"WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_3_b);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Day_3B.this, com.example.myapplication.MainActivity.class));
            }

        });

        final EditText A = findViewById(R.id.GP);
        final Button B = findViewById(R.id.CAL);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String CALString = A.getText().toString();
                double CAL = Double.parseDouble(CALString);

                double GPA = (1+CAL)*20;
                System.out.println(GPA);

                Toast.makeText(Day_3B.this, "GPA is " + GPA, Toast.LENGTH_LONG).show();
            }
        });
    }
}
