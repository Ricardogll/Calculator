package com.example.ricardogl.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private String num="";
    private TextView num_view;
    private float last_num;
    private String last_operator="";
    private float num_to_operate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        num_view = findViewById(R.id.curr_num);
        num_view.setText(num);
    }

    public void onClickDigit(View view){


        Button b = (Button)view;

        num += b.getText().toString().charAt(0);
        num_view.setText(num);

        last_num=Float.parseFloat(num);//stringToFloat
    }

    public void onClickOperator(View view){
        Button b = (Button)view;

        switch (b.getId()) {
            case R.id.btn_plus:
                last_operator="+";
                num_to_operate=last_num;
                break;
            case R.id.btn_minus:
                last_operator="-";
                num_to_operate=last_num;
                break;
            case R.id.btn_multiply:
                last_operator="*";
                num_to_operate=last_num;
                break;
            case R.id.btn_divide:
                last_operator="/";
                num_to_operate=last_num;
                break;
        }
        num_view.setText("");
        num="";
    }

    public void onClickDot(View view) {


        Button b = (Button) view;

        num += b.getText().toString().charAt(0);
        num_view.setText(num);

    }
    public void onClickEqual(View view){
        float aux;

        switch(last_operator) {
            case "+":
                aux=num_to_operate+last_num;
                num=Float.toString(aux);
                num_view.setText(num);
                last_num=aux;
                break;
            case "-":
                aux=num_to_operate-last_num;
                num=Float.toString(aux);
                num_view.setText(num);
                last_num=aux;
                break;
            case "*":
                aux=num_to_operate*last_num;
                num=Float.toString(aux);
                num_view.setText(num);
                last_num=aux;
                break;
            case "/":
                aux=num_to_operate/last_num;
                num=Float.toString(aux);
                num_view.setText(num);
                last_num=aux;
                break;
        }
    }
}
