package com.example.ejercicio1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio1p1.models.operacionesMath;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    Button btnSuma, btnResta, btnDivision, btnMultiplicacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txtNum1.getText().toString());
                int n2 = Integer.parseInt(txtNum2.getText().toString());
                operacionesMath operaciones = new operacionesMath();
                int resultado = operaciones.suma(n1,n2);
                String res = String.valueOf(resultado);

                Intent i = new Intent(getApplicationContext(),ActivityResultado.class);
                i.putExtra("dato", res);
                startActivity(i);
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txtNum1.getText().toString());
                int n2 = Integer.parseInt(txtNum2.getText().toString());
                operacionesMath operaciones = new operacionesMath();
                int resultado = operaciones.resta(n1,n2);
                String res = String.valueOf(resultado);

                Intent i = new Intent(getApplicationContext(),ActivityResultado.class);
                i.putExtra("dato", res);
                startActivity(i);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txtNum1.getText().toString());
                int n2 = Integer.parseInt(txtNum2.getText().toString());

                operacionesMath operaciones = new operacionesMath();
                int resultado = operaciones.division(n1,n2);
                String res;
                if (resultado==0){
                    res = "No se puede dividir entre 0";
                }else {
                    res = String.valueOf(resultado);
                }


                Intent i = new Intent(getApplicationContext(),ActivityResultado.class);
                i.putExtra("dato", res);
                startActivity(i);
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txtNum1.getText().toString());
                int n2 = Integer.parseInt(txtNum2.getText().toString());
                operacionesMath operaciones = new operacionesMath();
                int resultado = operaciones.multiplicacion(n1,n2);
                String res = String.valueOf(resultado);

                Intent i = new Intent(getApplicationContext(),ActivityResultado.class);
                i.putExtra("dato", res);
                startActivity(i);
            }
        });

    }

}