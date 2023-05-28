package com.example.dualscreen;

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

        EditText e = (EditText) findViewById(R.id.editTextTextPersonName);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText e = (EditText) findViewById(R.id.editTextTextPersonName);
                String variavelNome = e.getText().toString();
                Intent intent = new Intent(MainActivity.this, DualScreenResult.class);
                intent.putExtra("nome", variavelNome);
                startActivity(intent);
            }
        });
    }
}
