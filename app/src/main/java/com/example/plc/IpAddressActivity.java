package com.example.plc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



public class IpAddressActivity extends AppCompatActivity {

    private EditText ipAddressEditText;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_ip_address);

        ipAddressEditText = findViewById(R.id.ipAddressEditText);
        connectButton = findViewById(R.id.connectButton);
        Intent i=new Intent (IpAddressActivity.this,Dashboard.class);

        connectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ipAddress = ipAddressEditText.getText().toString().trim();

                if (!ipAddress.isEmpty()) {
                    i.putExtra ("ip", ipAddress );
                    startActivity ( i );
                    Toast.makeText(IpAddressActivity.this, "Connecting to: " + ipAddress, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(IpAddressActivity.this, "Please enter an IP address", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
