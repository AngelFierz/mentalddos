package MentalDDOS;

import java.util.Scanner;

/**
 *
 * @author Propietario
 */
public class CalculadoraCool {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        double valor1 = sc.nextDouble();
//Aqui pondre unos valores porque es necesario al 100% para alcanzar uhhhh no lo se
        System.out.println("Ingrese el segundo valor ahora mismo: ");
        double valor2 = sc.nextDouble();


        
        
        System.out.println("Ingrese la operacion que desea realizar:");
        System.out.println("Suma = S, Resta = R, Multiplicacion = M, Division = D, PONERLO EN MAYUSCULAAAS");
        
    //Aqui estuvo raro porque con nextLine el codigo se pasaba todo, Con Next solamente funciona, Pero venga apenas y se abrir un archivo aqui!
        String operation = sc.next();
        double resultado = 0;
        
        if(operation.equals("S")){
           resultado = valor1 + valor2;
            
        } else
            if(operation.equals("R")) {
            resultado = valor1 - valor2;
            
        } else if(operation.equals("M")) {
            resultado = valor1 * valor2;
            
            //Se pueden poner asciis raros?, Como -->  ( ͡° ͜ʖ ͡°) 
            
        } else if(operation.equals("D")) {
            {
                resultado = valor1 / valor2;
            }
        }else{
            System.out.println("Estas mal causita");
        }

        System.out.println("El resultado es: " + resultado);
        
       }catch(Exception EX){
           System.out.println("ERROR COLEGA");
       }
    }
}
