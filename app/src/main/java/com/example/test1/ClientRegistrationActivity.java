package com.example.test1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClientRegistrationActivity extends AppCompatActivity  {


    private TextView regPageQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairdresser_registration);
        regPageQuestion = findViewById(R.id.regPageQuestion);
        regPageQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClientRegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}