package com.example.plc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HardwareDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hardware_details );

        // Get references to TextViews
        TextView serialNoTextView = findViewById(R.id.serialNoTextView);
        TextView macAddressTextView = findViewById(R.id.macAddressTextView);
        TextView firmwareTextView = findViewById(R.id.firmwareTextView);
        TextView hardwareTextView = findViewById(R.id.hardwareTextView);
        TextView currentModeTextView = findViewById(R.id.currentModeTextView);
        TextView versionHardwareTextView = findViewById(R.id.versionHardwareTextView);
        TextView versionLogicTextView = findViewById(R.id.versionLogicTextView);
        TextView mlpiServerCodeTextView = findViewById(R.id.mlpiServerCodeTextView);
        TextView versionBspTextView = findViewById(R.id.versionBspTextView);

        // Set hardware data
        serialNoTextView.setText("1234567890");
        macAddressTextView.setText("00:11:22:33:44:55");
        firmwareTextView.setText("1.0.0");
        hardwareTextView.setText("X-100");
        currentModeTextView.setText("Normal");
        versionHardwareTextView.setText("2.0");
        versionLogicTextView.setText("3.5");
        mlpiServerCodeTextView.setText("MLPI-1234");
        versionBspTextView.setText("4.2.1");
    }
}