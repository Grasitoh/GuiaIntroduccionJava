/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Cuantas compras ha realizado el cliente?: ");
        int numeroCompras = scanner.nextInt();
        
        if (numeroCompras > 3) {
            
            System.out.println("Ingrese el valor de la compra:");
            double valorCompra = scanner.nextDouble();
            
            double descuento = 0;
            
            if (valorCompra < 10000) {
                descuento = 0.025; 
            } else if (valorCompra >= 10000 && valorCompra < 20000) {
                descuento = 0.04; 
            } else if (valorCompra >= 20000 && valorCompra < 40000) {
                descuento = 0.07; 
            } else if (valorCompra >= 40000) {
                descuento = 10000; 
            }
            
            double valorDescuento = (descuento >= 1) ? descuento : valorCompra * descuento; 
            double precioSinIVA = valorCompra - valorDescuento; 
            double IVA = precioSinIVA * 0.16; 
            double precioConIVA = precioSinIVA + IVA; 
            
            
            System.out.println("Valor de la compra sin IVA: $" + valorCompra);
            System.out.println("Descuento aplicado: $" + valorDescuento);
            System.out.println("Total a pagar sin IVA: $" + precioSinIVA);
            System.out.println("IVA: $" + IVA);
            System.out.println("Total a pagar con IVA: $" + precioConIVA);
        } else {
            System.out.println("No se aplican descuentos. Realice mas compras para obtener beneficios.");
        }
        
        scanner.close();
    }
}

