package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question8 extends AppCompatActivity {
    Button btn_backTo7;
    Button btn_nextTo9;
    EditText ed_score8;
    Integer score2;
    String score3;
    String score;
    Integer score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
        btn_backTo7=findViewById(R.id.btn_backTo7);
        btn_backTo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question8.this,Question7.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        score = intent.getStringExtra("SCORE");
        score1 = Integer.parseInt(score);
        name = intent.getStringExtra("NAME");
    }
    public void next(View view){
        ed_score8 = findViewById(R.id.ed_score8);
        score2 = Integer.parseInt(ed_score8.getText().toString());
        score2 = score1+score2;
        Intent intent = new Intent();
        intent.setClass(Question8.this,Question9.class);
        score3 = Integer.toString(score2);
        intent.putExtra("SCORE",score3);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}