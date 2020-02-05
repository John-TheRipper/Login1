package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class user extends AppCompatActivity {
    Button back_act;
    Button continus;
    EditText email_address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userandpass);

        email_address=findViewById(R.id.email_address);

        this.back_act = findViewById(R.id.back);
        back_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.continus = findViewById(R.id.continus);
        continus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_email = email_address.getText().toString().trim();
                if (name_email.isEmpty()){
                    email_address.setError("masih kosong !");
                }else {
                    Intent move_pass = new Intent(user.this, pass.class);
                    move_pass.putExtra(pass.gmail, name_email);
                    startActivity(move_pass);
                }
            }
        });

    }
}
