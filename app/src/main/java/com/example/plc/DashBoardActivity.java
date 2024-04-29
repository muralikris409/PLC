package com.example.plc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

class DashboardActivity extends AppCompatActivity {

    private Button controlButton;
    private Button softwareDetailsButton;
    private Button hardwareDetailsButton;
    private Button configureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        controlButton = findViewById(R.id.controlButton);
        softwareDetailsButton = findViewById(R.id.softwareDetailsButton);
        hardwareDetailsButton = findViewById(R.id.hardwareDetailsButton);
        configureButton = findViewById(R.id.configureButton);

        controlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Control button click
                // Example: Navigate to ControlActivity
//                startActivity(new Intent(DashboardActivity.this, ControlActivity.class));
            }
        });

        softwareDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Software Details button click
                // Example: Navigate to SoftwareDetailsActivity
//                startActivity(new Intent(DashboardActivity.this, SoftwareDetailsActivity.class));
            }
        });

        hardwareDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Hardware Details button click
                // Example: Navigate to HardwareDetailsActivity
//                startActivity(new Intent(DashboardActivity.this, HardwareDetailsActivity.class));
            }
        });

        configureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Configure button click
                // Example: Navigate to ConfigureActivity
//                startActivity(new Intent(DashboardActivity.this, ConfigureActivity.class));
            }
        });
    }
}
