package com.example.mac.takehomeassignment06_yup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        Intent intent = new Intent(this,YourReceipt.class);

        EditText amount = (EditText) findViewById(R.id.amount_edit_text);
        EditText tax = (EditText) findViewById(R.id.tax_edit_text);
        EditText tip = (EditText) findViewById(R.id.tip_edit_text);

        double total = Double.parseDouble(amount.getText().toString());
        double taxPercentage = Double.parseDouble(tax.getText().toString());
        double tipPercentage = Double.parseDouble(tip.getText().toString());
        double grandTotal = total*(1+taxPercentage+tipPercentage);

        String receipt = String.format("Total: %f\nSales Tax: %f\nTip: %f\nGrand Total: %.2f",
                total,total*taxPercentage,total*tipPercentage,grandTotal);

        intent.putExtra(EXTRA_MESSAGE,receipt);
        startActivity(intent);

    }

}
