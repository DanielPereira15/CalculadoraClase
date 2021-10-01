package com.example.calculadoraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    Button btnPulsado;
    String numero, primerSumando, op;
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

    public void btnNumeroPulsado(View v){
        Button btn = (Button) v;
        /*
        numero= numero + "1";
        this.txtResultado.setText(""+numero);
        */

        switch(btn.getTag().toString()){
            case "uno":
                numero= numero + "1";
                break;
            case "dos":
                numero=numero +"2";
                break;
            case "tres":
                numero=numero +"3";
                break;
            case "cuatro":
                numero=numero +"4";
                break;
            case "cinco":
                numero=numero +"5";
                break;
            case "seis":
                numero=numero +"6";
                break;
            case "siete":
                numero=numero +"7";
                break;
            case "ocho":
                numero=numero +"8";
                break;
            case "nueve":
                numero=numero +"9";
                break;
            case "cero":
                numero=numero +"0";
                break;
            default:
                this.txtResultado.setText("Error");
                break;
        }
        this.txtResultado.setText(numero);
    }



    public void btnSumar(View v){
        primerSumando=numero;
        numero="0";
        txtResultado.setText(""+numero);
        this.op="+";
    }

    public void btnRestar (View v){
        primerSumando=numero;
        numero="0";
        txtResultado.setText(numero);
        this.op="-";
    }
    public void btnMultiplicar (View v){
        primerSumando=numero;
        numero="0";
        txtResultado.setText(numero);
        this.op="X";
    }
    public void btnDividir (View v){
        primerSumando=numero;
        numero="0";
        txtResultado.setText(numero);
        this.op="/";
    }

    public void btnIgual(View v){
        switch (this.op){
            case "+":

                resultado= Integer.parseInt(primerSumando)  + Integer.parseInt( numero);
                break;
            case "-":

                resultado= Integer.parseInt(primerSumando)  - Integer.parseInt( numero);
                break;
            case "X":

                resultado= Integer.parseInt(primerSumando)  * Integer.parseInt( numero);
                break;
            case "/":

                resultado= Integer.parseInt(primerSumando)  / Integer.parseInt( numero);
                break;
            default:
                this.txtResultado.setText("DATOS ERRONEOS.");
                break;
        }
        this.txtResultado.setText(""+resultado);
    }
}