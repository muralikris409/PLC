package com.example.plc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_softwaredetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_softwaredetails );
        // Get references to TextViews
        TextView controllerNameTextView = findViewById(R.id.controllerNameTextView);
        TextView ipAddressTextView = findViewById(R.id.ipAddressTextView);
        TextView subnetTextView = findViewById(R.id.subnetTextView);
        TextView gatewayTextView = findViewById(R.id.gatewayTextView);
        TextView cpuLoadTextView = findViewById(R.id.cpuLoadTextView);
        TextView maxLoadTextView = findViewById(R.id.maxLoadTextView);
        TextView temperatureTextView = findViewById(R.id.temperatureTextView);
        TextView operationHoursTextView = findViewById(R.id.operationHoursTextView);
        TextView dateTextView = findViewById(R.id.dateTextView);
        TextView timeTextView = findViewById(R.id.timeTextView);

        // Set software data
        controllerNameTextView.setText("PLC Controller");
        ipAddressTextView.setText("192.168.1.1");
        subnetTextView.setText("255.255.255.0");
        gatewayTextView.setText("192.168.1.254");
        cpuLoadTextView.setText("50%");
        maxLoadTextView.setText("80%");
        temperatureTextView.setText("35°C");
        operationHoursTextView.setText("5000");
        dateTextView.setText("2024-05-10");
        timeTextView.setText("08:30:00");
    }
}