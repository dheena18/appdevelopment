package com.example.imgconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView naruto1 =(ImageView) findViewById(R.id.imageView);
        Button button2 =(Button) findViewById(R.id.button2);

    }
    public void click(View view){
        ImageView naruto1 =(ImageView) findViewById(R.id.imageView);
        naruto1.setImageResource(R.drawable.naruto2);
        Log.i("Info","BUTTONCLICKED.....");
    }
}