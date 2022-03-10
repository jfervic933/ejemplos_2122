/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author profesor
 */
public class FactorialRecursivo {
    
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    
    public static int factorial(int numero){
        
        numero = Math.abs(numero);
        if (numero == 0 || numero == 1){
            return 1;
        } else{
            return numero*factorial(--numero);
        }
        
    }
}
