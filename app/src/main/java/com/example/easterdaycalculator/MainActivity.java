package com.example.easterdaycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submitButton);
        submitListener submitClick = new submitListener();
        submitButton.setOnClickListener(submitClick);
    }

    private class submitListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            EditText yearEnter = findViewById(R.id.yearEnter);
            String year = yearEnter.getText().toString();

            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            intent.putExtra("Year",year);
            startActivity(intent);
        }
    }
}
