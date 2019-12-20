/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_01;

import java.util.Scanner;

public class Menu {
    public int aux;
    
public void opcion(){
    Operaciones cargaCot = new Operaciones();
   do{
    System.out.println("1. REGISTRAR COTIZACION DOLAR.");
    System.out.println("2. CONVERTIR DOLARES A PESOS.");
    System.out.println("3. CONVERTIR PESOS A DOLARES.");
    System.out.println("4. SALIR.");
    Scanner op = new Scanner(System.in);
    aux = op.nextInt();    
    switch(aux){
       case 1:
            System.out.println("INGRESO DE COTIZACION\n");
            cargaCot.cargaDolar();
            System.out.println("LA COTIZACION INGRESADA ES: U$D "+ cargaCot.dolar + "\n");
            break;
       case 2:
            Operaciones opera1 = new Operaciones();
            opera1.convertirDolar(cargaCot.dolar, opera1.cant);
            System.out.println("CONVERTIR DE DOLARES A PESOS:");
            System.out.println("COTIZACION REGISTRADA: "+cargaCot.getDolar());
            System.out.println("EL EQUIVALENTE EN PESOS ES: "+ opera1.conversionApesos);
            break;
       case 3:
            Operaciones opera2 = new Operaciones();
            opera2.convertirPesos(cargaCot.dolar, opera2.cant);
            System.out.println("CONVERTIR DE PESOS A DOLARES:");
            System.out.println("COTIZACION REGISTRADA: "+cargaCot.getDolar());
            System.out.println("EL EQUIVALENTE EN PESOS ES: "+ opera2.conversionAdolar);
            break;
       default:
            System.out.println("\nGRACIAS.");
   }    
   }while(aux!=4);
}
}    
    

