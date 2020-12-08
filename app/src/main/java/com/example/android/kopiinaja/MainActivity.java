package com.example.android.kopiinaja;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnMoveActivity = findViewById(R.id.btn_login);
        btnMoveActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        if (username.getText().toString().equals("") || password.getText().toString().equals("")) {
            Toast msg = Toast.makeText(MainActivity.this, "Lengkapi Data!", Toast.LENGTH_LONG);
            msg.setGravity(Gravity.BOTTOM, msg.getXOffset() / 2, msg.getYOffset() / 2);
            msg.show();
        } else {
            Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
            startActivity(moveIntent);
        }
    }
}
