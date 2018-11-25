package com.example.chetan.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice;
    private Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageDice =(ImageView) findViewById(R.id.imageView);
        imageDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        random = new Random();
        int myRandomNumber = random.nextInt(6) + 1;

        switch (myRandomNumber){
            case 1:imageDice.setImageResource(R.drawable.dice1);
                break;
            case 2:imageDice.setImageResource(R.drawable.dice2);
                break;
            case 3:imageDice.setImageResource(R.drawable.dice3);
                break;
            case 4:imageDice.setImageResource(R.drawable.dice4);
                break;
            case 5:imageDice.setImageResource(R.drawable.dice5);
                break;
            case 6:imageDice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
