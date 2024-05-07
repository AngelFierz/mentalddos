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
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Declaramos una variable de tipo int llamada valor 1 que sera igual a lo que el usuario ingrese en la terminal
        System.out.println("DECEASE FROM THE PAST es mejor sin Heidi");
        System.out.println("Ingrese el primer valor:");
        double valor1 = sc.nextDouble();
        
        System.out.println("Ingrese el segundo valor:");
        double valor2 = sc.nextDouble();
        
        double resultado = valor1 / valor2;
        System.out.println("La multiplicacion de los valores es " + resultado);
    } 
}
