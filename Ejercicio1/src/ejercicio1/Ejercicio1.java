/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author danie
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la colegiatura base:");
        double colegiaturaBase = scanner.nextDouble();
        
        System.out.println("Ingrese el promedio del alumno:");
        double promedio = scanner.nextDouble();
        
        double colegiaturaFinal; 
        
        
        if (promedio >= 8.5) {
            
            colegiaturaFinal = colegiaturaBase * 0.7;
            System.out.println("El alumno tiene un descuento. Debera pagar: $" + colegiaturaFinal);
        } else {
            
            colegiaturaFinal = colegiaturaBase * (1 + 0.16);
            System.out.println("El alumno debera pagar la colegiatura completa mas el IVA: $" + colegiaturaFinal);
        }
        
        scanner.close();
    }
}

