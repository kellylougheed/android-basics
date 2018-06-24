package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Question 2
    EditText messageEditText;
    TextView resultText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Question 3
        messageEditText = (EditText) findViewById(R.id.messageEditText);
        resultText = (TextView) findViewById(R.id.resultText);
        button = (Button) findViewById(R.id.button);

        // Questions 4-5
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = messageEditText.getText().toString();
                resultText.setText(message);
            }
        });

    }

}
