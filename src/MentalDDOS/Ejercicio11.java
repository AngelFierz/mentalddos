/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MentalDDOS;

import java.util.Scanner;

/**
 *
 * @author alumnog
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int a = 10;
        //String nombre = "Willirex";
        
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenido "+ nombre);
        
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();
        
        System.out.println(" Hola " + nombre + " tu edad es de " + edad);
    } 
}