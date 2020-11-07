/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

/**
 *
 * @author reroes
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {
   /**
     * @param args the command line arguments
     */
   public static void main(String[] args) { 
       //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //gasto1, d[0,n]
        double gasto1;
        //gasto2, d[0,n]
        double gasto2;
        //gasto2, d[0,n]
        double gasto3;
        //gastototal, d[0,n]
        double gastototal;
        //pido datos por teclado - entrada
        //escribir"ingrese el gasto1"
        System.out.println("ingrese el gasto1");
        //leer gasto1
        gasto1 = entrada.nextDouble();
        //escribir"ingrese el gasto2"
         System.out.println("ingrese el gasto2");
         //leer gasto2
        gasto2= entrada.nextDouble();
        //escribir"ingrese el gasto2"
        System.out.println("ingrese el gasto3");
        //leer gasto3
        gasto3= entrada.nextDouble();
       //proceso
        //gasto total <-- gasto1 + gasto2 + gasto3
         gastototal= gasto1+gasto2+gasto3
                 //salida
;         System.out.printf("el gasto total es: " + gastototal);
         
       
       
       
       
   }
    
    
    
    
    
    
}
