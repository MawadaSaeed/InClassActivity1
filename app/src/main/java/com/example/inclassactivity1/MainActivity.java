package com.example.inclassactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private Switch switchMale;
    private EditText edtHeight;
    private EditText edtWeight;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpApp();
    }

    public void setUpApp (){
        edtName = findViewById (R.id.edtName);
        switchMale = findViewById (R.id.switchMale);
        edtHeight = findViewById (R.id.edtHeight);
        edtWeight = findViewById (R.id.edtWeight);
    }

    public void CalculateBTN (View view){
        String Name = edtName.getText().toString();
        int W = Integer.parseInt(edtWeight.getText().toString());
        int H =  Integer.parseInt(edtHeight.getText().toString());

        int BMI = W/(H*H);

        String Result;

        if (switchMale.isChecked()){
            BMI += BMI*.05;
            Result = "Your BMI = " + BMI + ", " + Name;
        }
        else{
            Result = "Your BMI = " + BMI + ", " + Name;
        }
        Toast.makeText(this, Result, Toast.LENGTH_SHORT).show();


    }
}