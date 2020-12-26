package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question7 extends AppCompatActivity {
    Button btn_backTo6;
    Button btn_nextTo8;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
        btn_backTo6=findViewById(R.id.btn_backTo6);
        btn_backTo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question7.this,Question6.class);
                startActivity(intent);
            }
        });
        btn_nextTo8=findViewById(R.id.btn_nextTo8);
        btn_nextTo8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question7.this,Question8.class);
                startActivity(intent);
            }
        });

    }
}
