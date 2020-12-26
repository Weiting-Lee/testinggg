package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question6 extends AppCompatActivity {
    Button btn_backTo5;
    Button btn_nextTo7;
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
        btn_nextTo7=findViewById(R.id.btn_nextTo7);
        btn_nextTo7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question6.this,Question7.class);
                startActivity(intent);
            }
        });

    }
}