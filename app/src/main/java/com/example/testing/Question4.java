package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question4 extends AppCompatActivity {
    Button btn_backTo3;
    Button btn_nextTo5;
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
        btn_nextTo5=findViewById(R.id.btn_nextTo5);
        btn_nextTo5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question4.this,Question5.class);
                startActivity(intent);
            }
        });

    }
}