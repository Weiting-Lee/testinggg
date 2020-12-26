package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question8 extends AppCompatActivity {
    Button btn_backTo7;
    Button btn_nextTo9;
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
        btn_nextTo9=findViewById(R.id.btn_nextTo9);
        btn_nextTo9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question8.this,Question9.class);
                startActivity(intent);
            }
        });

    }
}