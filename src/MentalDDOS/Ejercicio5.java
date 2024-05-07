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
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte edad = sc.nextByte();
        
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("eres menor de edad!");
        }
    }
}
