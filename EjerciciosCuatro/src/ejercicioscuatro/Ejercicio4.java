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
public class Ejercicio4 {
    public static void main(String[] args) { 
       //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //costo del cpu ,d[0, n]
        double valorcpu;
        //costo del teclado, d[0, n]
        double valorteclado;
        //costo del pantalla, d[0, n]
        double valorpantalla; 
         //costo del raton, d[0, n]
        double valorraton; 
        //costo de la computadora, d[0, n]
        double valorcomputadora;
         //pido datos por teclado - entrada
        System.out.println("ingrese costo del cpu");
       valorcpu = entrada.nextDouble();
       System.out.println("ingrese costo de la pantalla");
       valorpantalla = entrada.nextDouble();
         System.out.println("ingrese costo del teclado");
        valorteclado= entrada.nextDouble(); 
        System.out.println("ingrese costo del raton");
        valorraton= entrada.nextDouble();
        //proceso
         valorcomputadora = (valorcpu + valorpantalla + valorteclado + valorraton);
         //salida
         System.out.printf("ingresar costo computadora: "+ valorcomputadora);
         
        
        
        
    
}
}
