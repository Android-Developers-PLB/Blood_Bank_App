package com.example.blood_bank_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when user taps on 'Register' TextView
    public void toRegister(View view) {

        Toast.makeText(MainActivity.this,"Button Clicked!!", Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(this, RegisterActivity.class);
        startActivity(myIntent);
    }
}