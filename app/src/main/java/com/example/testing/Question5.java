package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question5 extends AppCompatActivity {
    Button btn_backTo4;
    Button btn_nextTo6;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        btn_backTo4=findViewById(R.id.btn_backTo4);
        btn_backTo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question5.this,Question4.class);
                startActivity(intent);
            }
        });
        btn_nextTo6=findViewById(R.id.btn_nextTo6);
        btn_nextTo6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question5.this,Question6.class);
                startActivity(intent);
            }
        });

    }
}