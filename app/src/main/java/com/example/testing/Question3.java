package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question3 extends AppCompatActivity {
    Button btn_backTo2;
    Button btn_nextTo4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        btn_backTo2=findViewById(R.id.btn_backTo2);
        btn_backTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(Question3.this,Question2.class);
                startActivity(intent);
            }
        });
        btn_nextTo4=findViewById(R.id.btn_nextTo4);
        btn_nextTo4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(Question3.this,Question4.class);
                startActivity(intent);
            }
        });

    }
}
