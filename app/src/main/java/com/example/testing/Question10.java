package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question10 extends AppCompatActivity {
    Button btn_backTo9;
    Button btn_nextToTheResult;
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
        btn_nextToTheResult=findViewById(R.id.btn_nextToTheReult);
        btn_nextToTheResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question10.this,Result.class);
                startActivity(intent);
            }
        });

    }
}