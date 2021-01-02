package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Question1 extends AppCompatActivity {
    Button btn_back;
    Button btn_next;
    EditText ed_score1;
    String  score1;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        btn_back=findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question1.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        name = intent.getStringExtra("NAME");
    }
    public void next(View view){
        ed_score1=findViewById(R.id.ed_score1);
        score1=ed_score1.getText().toString();
        Intent intent=new Intent();
        intent.setClass(Question1.this,Question2.class);
        intent.putExtra("SCORE",score1);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }

}
