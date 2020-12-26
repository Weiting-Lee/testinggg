package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question9 extends AppCompatActivity {
    Button btn_backTo8;
    Button btn_nextTo10;
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
        btn_nextTo10=findViewById(R.id.btn_nextTo10);
        btn_nextTo10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question9.this,Question10.class);
                startActivity(intent);
            }
        });

    }
}