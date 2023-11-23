package com.example.calcfinita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcola;
    private EditText numero1;
    private EditText numero2;

    private EditText operatore;
    private TextView risultato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcola = (Button) findViewById(R.id.btnCalcola);
        risultato = (TextView)findViewById(R.id.risultato);
        numero1 = (EditText)findViewById(R.id.numero1);
        numero2 = (EditText)findViewById(R.id.numero2);
        operatore = (EditText)findViewById(R.id.operatore);
    }


    public void calcola(View v)
    {
        String strNum1 = numero1.getText().toString();
        String strNum2 = numero2.getText().toString();
        String oper = operatore.getText().toString();

        int n1 = Integer.parseInt(strNum1);
        int n2 = Integer.parseInt(strNum2);
        int res=0;
        if(oper.equals("+")){
            res = n1 + n2 ;
            String strStr = String.valueOf(res);
            risultato.setText(strStr);
        }
        else if(oper.equals("-")){
            res = n1 - n2 ;
            String strStr = String.valueOf(res);
            risultato.setText(strStr);
        }
        else if(oper.equals("*")){
            res = n1 * n2 ;
            String strStr = String.valueOf(res);
        }
        else if(oper.equals("/")){
            res = n1 / n2 ;
        }
        String strStr = String.valueOf(res);
        risultato.setText(strStr);
    }


}