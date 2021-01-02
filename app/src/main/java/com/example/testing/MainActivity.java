package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_start;
    EditText ed_name;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void start(View view){
        ed_name = findViewById(R.id.ed_name);
        name = ed_name.getText().toString();
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Question1.class);
        intent.putExtra("NAME",name);
        startActivity(intent);

    }
}
