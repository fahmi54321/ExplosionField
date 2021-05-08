package com.android.a52explosionfield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExplosionField explosionField = ExplosionField.attach2Window(this);
        Button button = findViewById(R.id.btnTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                explosionField.explode(button);
            }
        });

    }
}