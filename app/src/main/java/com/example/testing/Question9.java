package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question9 extends AppCompatActivity {
    Button btn_backTo8;
    Button btn_nextTo10;
    EditText ed_score9;
    Integer score2;
    String score3;
    String score;
    Integer score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        btn_backTo8=findViewById(R.id.btn_backTo8);
        btn_backTo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question9.this,Question8.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        score = intent.getStringExtra("SCORE");
        score1 = Integer.parseInt(score);
        name = intent.getStringExtra("NAME");
        Log.d("haha",name+"");
    }
    public void next(View view){
        ed_score9 = findViewById(R.id.ed_score9);
        score2 = Integer.parseInt(ed_score9.getText().toString());
        score2 = score1+score2;
        Intent intent = new Intent();
        intent.setClass(Question9.this,Question10.class);
        score3 = Integer.toString(score2);
        intent.putExtra("SCORE",score3);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}