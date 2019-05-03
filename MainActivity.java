package com.example.calculatorforinternship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    String data;
    int result;
    Compute com;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.kartik);
        data = "";

        result= 0;

        com=new Compute(data,result);
    }

    public void subtract(View view) {
        text.setText(text.getText().toString()+"-");
    }

    public void point(View view) {
        text.setText(text.getText().toString().substring(0,text.getText().toString().length()-1));
    }

    public void zero(View view) {
        text.setText(text.getText().toString()+"0");
    }

    public void assign(View view) {

        data = text.getText().toString();

        result= (int) Integer.parseInt(String.valueOf(data.charAt(0)));

        com=new Compute(data,result);

        result=com.compute(1);

        text.setText(String.valueOf(result));
    }

    public void add(View view) {
        text.setText(text.getText().toString()+"+");
    }

    public void three(View view) {
        text.setText(text.getText().toString()+"3");
    }

    public void two(View view) {
        text.setText(text.getText().toString()+"2");
    }

    public void one(View view) {
        text.setText(text.getText().toString()+"1");
    }

    public void divide(View view) {
        text.setText(text.getText().toString()+"/");
    }

    public void six(View view) {
        text.setText(text.getText().toString()+"6");
    }

    public void five(View view) {
        text.setText(text.getText().toString()+"5");
    }

    public void four(View view) {
        text.setText(text.getText().toString()+"4");
    }


    public void multiply(View view) {
        text.setText(text.getText().toString()+"x");
    }

    public void nine(View view) {
        text.setText(text.getText().toString()+"9");
    }

    public void eight(View view) {
        text.setText(text.getText().toString()+"8");
    }

    public void seven(View view) {
        text.setText(text.getText().toString()+"7");
    }
}
