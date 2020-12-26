package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question2 extends AppCompatActivity {
    Button btn_backTo1;
    Button btn_nextTo3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        btn_backTo1=findViewById(R.id.btn_backTo1);
        btn_backTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question2.this,Question1.class);
                startActivity(intent);
            }
        });
        btn_nextTo3=findViewById(R.id.btn_nextTo3);
        btn_nextTo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question2.this,Question3.class);
                startActivity(intent);
            }
        });

    }
}
