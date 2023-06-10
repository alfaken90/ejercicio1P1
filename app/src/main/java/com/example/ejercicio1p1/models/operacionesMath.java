package com.example.ejercicio1p1.models;

import android.widget.Toast;

public class operacionesMath {

    public int suma(int n1, int n2) {
        return n1 + n2;
    }
    public int resta(int n1, int n2) {
        return n1 - n2;
    }
    public int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    public int division(int n1, int n2) {
        if (n2 == 0){
            return 0;
        }else {
            return (int) n1 / n2;
        }
    }
}
