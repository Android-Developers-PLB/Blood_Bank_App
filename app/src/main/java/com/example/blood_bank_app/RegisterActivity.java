package com.example.blood_bank_app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameEt, mobilenoEt, addressEt, cityEt, pincodeEt, emailEt, dobEt, passwordEt, confirmpasswordEt;
    private AutoCompleteTextView stateTv, bloodgrpTv;
    //private RadioButton maleRb, femaleRb, otherRb;
    private RadioGroup genderRg;
    private CheckBox diseasesCb;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nameEt = findViewById(R.id.name);
        mobilenoEt = findViewById(R.id.mobileno);
        addressEt = findViewById(R.id.address);
        cityEt = findViewById(R.id.city);
        stateTv = findViewById(R.id.state);
        pincodeEt = findViewById(R.id.pincode);
        emailEt = findViewById(R.id.email);
        dobEt = findViewById(R.id.dob);
        bloodgrpTv = findViewById(R.id.bloodgrp);
        //maleRb = findViewById(R.id.male);
        //femaleRb = findViewById(R.id.female);
        //otherRb = findViewById(R.id.other);
        genderRg = findViewById(R.id.gender);
        diseasesCb = findViewById(R.id.diseases);
        passwordEt = findViewById(R.id.password);
        confirmpasswordEt = findViewById(R.id.confirmpassword);
        registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, mobileno, address, city, state, pincode, email, dob, bloodgrp, gender, diseases, password, confirmpassword;
                int gender_index;
                boolean diseases_flag;

                name = nameEt.getText().toString();
                mobileno = mobilenoEt.getText().toString();
                address = addressEt.getText().toString();
                city = cityEt.getText().toString();
                state = stateTv.getText().toString();
                pincode = pincodeEt.getText().toString();
                email = emailEt.getText().toString();
                dob = dobEt.getText().toString();
                bloodgrp = bloodgrpTv.getText().toString();

                gender_index = genderRg.getCheckedRadioButtonId();
                if (gender_index==0) gender="M";
                else if (gender_index==1) gender="F";
                else gender="O";

                diseases_flag = diseasesCb.isSelected();
                if (diseases_flag==true) diseases = "Cancer";
                else diseases = "";

                password = passwordEt.getText().toString();
                confirmpassword = confirmpasswordEt.getText().toString();

                showMessage(name+"\n"+mobileno+"\n"+address+"\n"+city+"\n"+state+"\n"+pincode+"\n"+email+
                        "\n"+dob+"\n"+bloodgrp+"\n"+gender+"\n"+diseases+"\n"+password+"\n"+confirmpassword);
            }
        });
    }

    private void showMessage(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}