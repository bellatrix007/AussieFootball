package com.example.aussiefootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // buttons
    private Button goal1, behind1, goal2, behind2;
    // scores
    private TextView team1, team2;
    // score values
    private int s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // scores are 0
        s1 = 0;
        s2 = 0;

        // indentify components by id
        goal1 = findViewById(R.id.goal1);
        behind1 = findViewById(R.id.behind1);
        goal2 = findViewById(R.id.goal2);
        behind2 = findViewById(R.id.behind2);
        team1 = findViewById(R.id.cur1);
        team2 = findViewById(R.id.cur2);

        // click listeners
        goal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add 6
                s1 += 6;
                // update in UI
                team1.setText("Current: " + s1);
            }
        });
        behind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add 1
                s1 ++;
                // update in UI
                team1.setText("Current: " + s1);
            }
        });
        goal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add 6
                s2 += 6;
                // update in UI
                team2.setText("Current: " + s2);
            }
        });
        behind2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // add 1
                s2 ++;
                // update in UI
                team2.setText("Current: " + s2);
            }
        });
    }
}