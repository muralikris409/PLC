package com.example.plc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    private Button controlButton;
    private Button softwareDetailsButton;
    private Button hardwareDetailsButton;
    private Button configureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        TextView ip=findViewById(R.id.ip);
        new Handler().postDelayed ( new Runnable () {
            @Override
            public void run() {
                ip.setText ( getIntent ().getStringExtra ( "ip" ) );
            }
        },1000 );

        controlButton = findViewById(R.id.controlButton);
        softwareDetailsButton = findViewById(R.id.softwareDetailsButton);
        hardwareDetailsButton = findViewById(R.id.hardwareDetailsButton);
        configureButton = findViewById(R.id.configureButton);

        controlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Dashboard.this, Configuration.class));
            }
        });

        softwareDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Software Details button click
                // Example: Navigate to SoftwareDetailsActivity
                startActivity(new Intent(Dashboard.this, activity_softwaredetails.class));
            }
        });

        hardwareDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Hardware Details button click
                // Example: Navigate to HardwareDetailsActivity
                startActivity(new Intent(Dashboard.this, HardwareDetailsActivity.class));
            }
        });

        configureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Configure button click
                // Example: Navigate to ConfigureActivity
                startActivity(new Intent(Dashboard.this, Configuration.class));
            }
        });
    }
}
