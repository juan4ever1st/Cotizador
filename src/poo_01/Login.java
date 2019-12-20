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
public class Login {
    public String usuario = "itma";
    public String clave = "2019";
    Menu opciones = new Menu();

    public void ingreso () {
        String usuarioAux, claveAux;
        do{
            System.out.println("Ingrese Usuario: ");
            Scanner teclado1 = new Scanner (System.in);
            usuarioAux = teclado1.nextLine();
            System.out.println("Ingrese Clave: ");
            Scanner teclado2 = new Scanner (System.in);
            claveAux = teclado2.nextLine();
        
            if ((usuarioAux.equals(usuario)) && (claveAux.equals(clave))){
                opciones.opcion();
            }else
                System.out.println("Verifique los datos ingresados!"); 
        }while((!usuarioAux.equals(usuario)) || (!claveAux.equals(clave)));
        
}

    
}
