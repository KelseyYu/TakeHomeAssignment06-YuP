package com.example.mac.takehomeassignment06_yup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);

        String title = "Your Receipt";
        setTitle(title);

        Intent intent = getIntent();
        String receipt = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.receipt);
        textView.setText(receipt);

    }

}
