package com.leo.cyber2021ex04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private int clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        clicks = 0;
    }

    public void onButtonClick(View view) {
        clicks++;
        int boomCount = 0;
        if (clicks % 7 == 0)
            boomCount++;
        if (clicks % 10 == 7)
            boomCount++;
        if ((clicks / 10) % 10 == 7)
            boomCount++;
        if (boomCount == 0)
            button.setText("Click number: " + clicks);
        else
            button.setText("BOOM! x" + boomCount);
    }
}
