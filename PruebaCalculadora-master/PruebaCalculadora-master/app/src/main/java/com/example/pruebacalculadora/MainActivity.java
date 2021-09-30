package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNums;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnMas;
    Button btnResta;
    Button btnX;
    Button btnDiv;
    Button btnIgual;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNums=findViewById(R.id.vistaNum);
        btn0=findViewById(R.id.button0);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);
        btnMas=findViewById(R.id.buttonSuma);
        btnResta=findViewById(R.id.buttonResta);
        btnX=findViewById(R.id.buttonX);
        btnDiv=findViewById(R.id.buttonDiv);
        btnIgual=findViewById(R.id.buttonIgual);
        btnReset=findViewById(R.id.buttonReset);

    }

    public void activar(View v){



        String vistaNumeros = txtNums.getText().toString();

        txtNums.setText(btn0.getText());
        if(txtNums.getText().equals("1")){

        }

    }


}