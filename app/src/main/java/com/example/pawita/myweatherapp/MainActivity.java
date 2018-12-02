package com.example.pawita.myweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.display);
    }

    public void displayText(View view) {
        if (text != null) {
            if (text.getText().length() == 0) {
                text.setText("Pawita es guapa");
            } else {
                text.setText("");
            }
        }
    }
}
