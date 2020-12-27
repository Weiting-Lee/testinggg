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
        ed_name = findViewById(R.id.ed_name);

    }
    public void start(View view){
        name = ed_name.getText().toString();
        Log.d("haha",name+"56");
        Intent intent = new Intent();
        Intent intent2 = new Intent();
        intent2.putExtra("NAME", name);
        intent.setClass(MainActivity.this, Question1.class);
        intent2.setClass(MainActivity.this, Result.class);
        startActivity(intent);
    }
}
