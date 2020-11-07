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
public class Ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
         //monton, d[0,n]
        double monton;
        //interes, d[0,n]
        double interes;
        //plazo, int[12]
        int plazo=(12); 
        //pago, d[0,n]
        double pago;
        //pido datos por teclado - entrada
        System.out.println("ingrese el monton");
        monton = entrada.nextDouble();
         System.out.println("ingrese el interes");
        interes= entrada.nextDouble();
        //calculo
        pago=(monton*plazo) + interes;
        //salida
        System.out.println("pago mensual del prestamo" + pago);
    
    
    
    
    
    
}
}
