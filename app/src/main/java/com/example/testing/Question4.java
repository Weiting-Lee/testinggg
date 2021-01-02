package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question4 extends AppCompatActivity {
    Button btn_backTo3;
    Button btn_nextTo5;
    EditText ed_score4;
    Integer score2;
    String score3;
    String score;
    Integer score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        btn_backTo3=findViewById(R.id.btn_backTo3);
        btn_backTo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question4.this,Question3.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        score = intent.getStringExtra("SCORE");
        score1 = Integer.parseInt(score);
        name = intent.getStringExtra("NAME");
    }
    public void next(View view){
        ed_score4 = findViewById(R.id.ed_score4);
        score2 = Integer.parseInt(ed_score4.getText().toString());
        score2 = score1+score2;
        Intent intent = new Intent();
        intent.setClass(Question4.this,Question5.class);
        score3 = Integer.toString(score2);
        intent.putExtra("SCORE",score3);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}