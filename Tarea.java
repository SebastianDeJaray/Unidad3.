
package tarea;

import java.util.Scanner;


public class Tarea {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa un numero entero");
        int numero = scanner.nextInt();
        
        if (numero % 02 == 0){
            System.out.println("El numero "+ numero+" es par");
        }else{
            
            System.out.println("El numero " + numero +" es impar.");
            
        }
        scanner. close();
    }
    
}
