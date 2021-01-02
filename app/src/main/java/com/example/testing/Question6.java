package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question6 extends AppCompatActivity {
    Button btn_backTo5;
    Button btn_nextTo7;
    EditText ed_score6;
    Integer score2;
    String score3;
    String score;
    Integer score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        btn_backTo5=findViewById(R.id.btn_backTo5);
        btn_backTo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question6.this,Question5.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        score = intent.getStringExtra("SCORE");
        score1 = Integer.parseInt(score);
        name = intent.getStringExtra("NAME");
    }
    public void next(View view){
        ed_score6 = findViewById(R.id.ed_score6);
        score2 = Integer.parseInt(ed_score6.getText().toString());
        score2 = score1+score2;
        Intent intent = new Intent();
        intent.setClass(Question6.this,Question7.class);
        score3 = Integer.toString(score2);
        intent.putExtra("SCORE",score3);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}