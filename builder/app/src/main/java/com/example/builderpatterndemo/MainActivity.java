package com.example.builderpatterndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.greet_textview);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Greeting greeting = new Greeting.Builder()
                .setGender(Gender.MALE)
                .setName("Talha")
                .build();

        textView.setText(greeting.greet());


    }
}
