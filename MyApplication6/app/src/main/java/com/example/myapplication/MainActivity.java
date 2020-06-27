package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.Editable;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    TextView H;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText A = findViewById(R.id.quiz);
        final EditText B = findViewById(R.id.homework);
        final EditText C = findViewById(R.id.midterm);
        final EditText D = findViewById(R.id.final0);
         H = findViewById(R.id.Grade);
        Button E = findViewById(R.id.calculate);
        Button G = findViewById(R.id.reset);

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A.setText("");
                B.setText("");
                C.setText("");
                D.setText("");

            }

        });


            Button gpa = findViewById(R.id.gpa);
        gpa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Day_3B.class);
                    startActivity(intent);

                }
            });

        E.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String quizString = A.getText().toString();
                    double quiz = Double.parseDouble(quizString);

                    String homeworkString = B.getText().toString();
                    double homework = Double.parseDouble(homeworkString);

                    String midtermString = C.getText().toString();
                    double midterm = Double.parseDouble(midtermString);

                    String final0String = D.getText().toString();
                    double final0 = Double.parseDouble(final0String);

                    double grade = (quiz + (homework + (midterm + final0)));

                    H.setText(""+grade(grade));

                }
            });
    }
    public  String grade(double student){

        if (student >= 90 ){
            H.setBackgroundColor(Color.RED);
            return"A";
        }else if (student >= 80){
            H.setBackgroundColor(Color.BLACK);
           return ("B");
        }else if (student >= 70){
            H.setBackgroundColor(Color.GRAY);
            return ("c");
        }else if (student >= 60){
            H.setBackgroundColor(Color.GREEN);
            return ("D");
        }else   {
            H.setBackgroundColor(Color.MAGENTA);
            return ("F");
        }
    }
}
