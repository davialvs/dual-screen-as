package com.example.dualscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DualScreenResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dual_screen_result);

        TextView t = (TextView) findViewById(R.id.textView3);
        String nome = getIntent().getStringExtra("nome");
        t.setText(nome);
    }
}