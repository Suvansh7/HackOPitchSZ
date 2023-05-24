package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sp_reg extends AppCompatActivity {
    Button si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_reg);
        getSupportActionBar().setTitle("Registration");
        si=findViewById(R.id.button24);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sp_reg
                        .this, sp_signin.class);
                startActivity(intent);
            }
        });

    }
    }

