package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView im_1;
    ImageView im_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Dicee", Toast.LENGTH_SHORT).show();
        im_1 = findViewById(R.id.im_1);
        im_2 = findViewById(R.id.im_2);
    }
    int []diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6,};
    public void btn(View v){
        Random numberRandom = new Random();
        int number = numberRandom.nextInt(6);
        im_1.setImageResource(diceArray[number]);
        number= numberRandom.nextInt(6);
        im_2.setImageResource(diceArray[number]);
    }
}