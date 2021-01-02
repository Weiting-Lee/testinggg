package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question10 extends AppCompatActivity {
    Button btn_backTo9;
    Button btn_nextToTheResult;
    EditText ed_score10;
    Integer score2;
    String score3;
    String score;
    Integer score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
        btn_backTo9=findViewById(R.id.btn_backTo9);
        btn_backTo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question10.this,Question9.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        score = intent.getStringExtra("SCORE");
        score1 = Integer.parseInt(score);
        name = intent.getStringExtra("NAME");
    }
    public void next(View view){
        ed_score10 = findViewById(R.id.ed_score10);
        score2 = Integer.parseInt(ed_score10.getText().toString());
        score2 = score1+score2;
        Intent intent = new Intent();
        intent.setClass(Question10.this,Result.class);
        score3 = Integer.toString(score2);
        Log.d("hahaha",score3+"");
        intent.putExtra("SCORE",score3);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}