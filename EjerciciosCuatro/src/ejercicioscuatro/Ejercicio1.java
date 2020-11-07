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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //base, d[0,n]
        double base;
        //altura, d[0,n]
        double altura;
        //area, d[0,n]
        double area; 
        //pido datos por teclado - entrada
        System.out.println("ingrese la altura");
        altura = entrada.nextDouble();
         System.out.println("ingrese la base");
        base= entrada.nextDouble();
         //proceso
         area=(base*altura)/2;
         //salida
         System.out.printf("el area del triangulo es: "+ area);
         
         
         
         
         
    }
    
}
