/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MentalDDOS;

import java.util.Scanner;
/**
 *
 * @author alumnog
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaramos una variable de tipo int llamada valor 1 que sera igual a lo que el usuario ingrese en la terminal
        System.out.println("Ola tonoto");
        System.out.println("Ingrese el primer valor:");
        int valor1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo valor:");
        int valor2 = sc.nextInt();
        
        int resultado = valor1 + valor2;
        System.out.println("La suma de los valores es " + resultado);
    }
    
}
