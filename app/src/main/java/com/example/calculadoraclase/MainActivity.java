package com.example.calculadoraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    Button btnPulsado;
    String numero, primerSumando, op,  segundoSumando;
    int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //esto lo que hace es que al iniciar la app txt toma el valor
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        numero="";
        txtResultado.setText("0");
    }

    public void btnUno(View v){

        numero= numero + "1";
        this.txtResultado.setText(""+numero);
    }

    public void btnDos(View v){

        numero= numero + "2";
        this.txtResultado.setText(""+numero);
    }



    public void btnSumar(View v){
        primerSumando=numero;
        numero="";
        txtResultado.setText(numero);
        this.op="+";
    }

    public void btnIgual(View v){
        segundoSumando=numero;
        resultado=Integer.parseInt( primerSumando)+Integer.parseInt(segundoSumando);
        txtResultado.setText(resultado);
    }
}