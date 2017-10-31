package com.bmicalculator.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {
    private EditText editTextWeight,editTextHeight;
    private ImageView imageViewResult;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);

        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);

        textViewResult=(TextView)findViewById(R.id.textViewResult);
    }

    public void calculateBMI(View view){
        double weight,height,BMI;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        BMI=weight/(height*height);
        if(BMI<=18.5){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("You are under weight!");
        }
        else if(BMI>18.5&&BMI<21){
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("You are normal.");
        }
        else if(BMI>=21){
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("You are over weight!");
        }
    }

    public void Reset(View view){
        imageViewResult.setImageResource(R.drawable.empty);
        editTextWeight.setText("");
        editTextHeight.setText("");
        textViewResult.setText("Welcome");
    }
}
