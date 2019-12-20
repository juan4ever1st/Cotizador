/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_01;

import java.util.Scanner;

/**
 *
 * @author W7 ULTIMATE
 */
public class Operaciones {
    float cant, dolar, conversionApesos, conversionAdolar;

    public void cargaDolar(){
        System.out.println("INGRESO DE COTIZACION MONEDA = DOLAR.");
        System.out.println("Ingrese la cotización actual: ");
        Scanner dato = new Scanner(System.in);
        dolar = dato.nextFloat();
    }
    public float convertirDolar(float dolar, float cant){
        System.out.println("Ingrese la cantidad de DOLARES: ");
        Scanner aux = new Scanner(System.in);
        float cantIngresada = aux.nextFloat();
        conversionApesos = cantIngresada*dolar;
        return conversionApesos;
    }
        public float convertirPesos(float dolar, float cant){
        System.out.println("Ingrese la cantidad de PESOS: ");
        Scanner aux = new Scanner(System.in);
        float cantIngresada = aux.nextFloat();
        conversionAdolar = cantIngresada/dolar;
        return conversionAdolar;
    }

    public float getDolar() {
        return dolar;
    }

    public float getCant() {
        return cant;
    }
        
}
