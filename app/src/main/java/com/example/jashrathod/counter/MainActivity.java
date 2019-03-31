package com.example.jashrathod.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.jashrathod.counter.R.id.textview1;
import static com.example.jashrathod.counter.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        final TextView tv = findViewById(R.id.textview1);

        final int[] current_count = {0};
        tv.setText(Integer.toString(current_count[0]));

        Button reset = findViewById(R.id.reset_button);
        Button count = findViewById(R.id.count_button);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_count[0]++;
                tv.setText(Integer.toString(current_count[0]));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_count[0] = 0;
                tv.setText(Integer.toString(current_count[0]));
            }
        });
    }
}
