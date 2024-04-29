package com.example.plc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener( v -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (username.equals("test") && password.equals("test")) {
                startActivity ( new Intent (this,IpAddressActivity.class) );
                Toast.makeText( MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
            } else {
                // Login failed
                Toast.makeText( MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        } );
    }
}
