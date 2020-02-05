package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pass extends AppCompatActivity {
    public static final String gmail="NAME_GMAIL";
    TextView name_gmail;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        String gmail2 =getIntent().getStringExtra(gmail);
        name_gmail =findViewById(R.id.gmail);
        name_gmail.setText(gmail2);
        back =findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }
}
