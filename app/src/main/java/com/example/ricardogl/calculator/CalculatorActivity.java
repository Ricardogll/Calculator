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
                break;
        }
        num_view.setText("");
    }

    public void onClickEqual(View view){


    }
}
