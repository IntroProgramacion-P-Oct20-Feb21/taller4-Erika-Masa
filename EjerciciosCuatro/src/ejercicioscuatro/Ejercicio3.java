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
public class Ejercicio3 {
    
    public static void main(String[] args) { 
       //declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    //costo_por_minuto, d[0,n]
        double costo_por_minuto;
        //los_minutos_consumindos_al_mes, d[0,n]
        double los_minutos_consumindos_al_mes;
        //valor_de_la_plantilla, d[0,n]
        double valor_de_la_plantilla; 
    // pido datos por teclado - entrada
        System.out.println("ingrese los costos por minuto");
        costo_por_minuto = entrada.nextDouble();
         System.out.println("los_minutos_consumindos_al_mes");
        los_minutos_consumindos_al_mes= entrada.nextDouble();
    //proceso
         valor_de_la_plantilla=(costo_por_minuto*los_minutos_consumindos_al_mes)/2;
    //salida
    System.out.println("el valor de la plantilla: "+valor_de_la_plantilla);
    
    
    
    
    }
}
