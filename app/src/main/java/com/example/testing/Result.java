package com.example.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    Button btn_homepage;
    Button btn_score1;
    Button btn_score2;
    Button btn_score3;
    Button btn_score4;
    Button btn_score5;
    Button btn_score6;
    ImageView imageView;
    //宣告

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        imageView = findViewById(R.id.imageView);
        btn_score1 = findViewById(R.id.btn_score1);
        btn_score2 = findViewById(R.id.btn_score2);
        btn_score3 = findViewById(R.id.btn_score3);
        btn_score4 = findViewById(R.id.btn_score4);
        btn_score5 = findViewById(R.id.btn_score5);
        btn_score6 = findViewById(R.id.btn_score6);
        //來源

        btn_homepage = findViewById(R.id.btn_homePage);
        btn_homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void button(){
        btn_score1.setVisibility(Button.GONE);
        btn_score2.setVisibility(Button.GONE);
        btn_score3.setVisibility(Button.GONE);
        btn_score4.setVisibility(Button.GONE);
        btn_score5.setVisibility(Button.GONE);
        btn_score6.setVisibility(Button.GONE);
    }
    //按鈕隱形

    public void btn1 (View view){
        imageView.setVisibility(View.VISIBLE);//顯示圖片
        imageView.setImageResource(R.drawable.stra_pic);//設定圖片來源
        button();//按鈕隱形
    }

    public void btn2 (View view){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.brown_pic);
        button();
    }

    public void btn3 (View view){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.green_pic);
        button();
    }

    public void btn4 (View view){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.yellow_pic);
        button();
    }

    public void btn5 (View view){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.beer_pic);
        button();
    }

    public void btn6 (View view){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.taro_pic);
        button();
    }
}
