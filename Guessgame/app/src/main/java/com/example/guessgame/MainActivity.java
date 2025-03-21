package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView =(TextView) findViewById(R.id.textView);
        TextView textView1 =(TextView) findViewById(R.id.textView2);
        EditText editText =(EditText) findViewById(R.id.editText);
        Button button =(Button) findViewById(R.id.button);

        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guess(View view){
        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;

        if(guessValue>randomNumber){
            message="Lower Value !!";
        }else if(guessValue<randomNumber){
            message="Higher Value !!";
        }else{
            message="You WON";
        }

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
}