/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operando1 = 1, operando2 = 1;
        boolean solicitarDatos = true;

        System.out.println("Bienvenido al calculator");

//        do {
//            System.out.println("Introduce dos operandos (entre -100 y 100)");
//
//            do {
//                solicitarDatos = true;
//                try {
//
//                    // Bloque de código candidato a lanzar la excepción
//                    System.out.println("Introduce operando 1: ");
//                    operando1 = sc.nextInt();
//                    System.out.println("Introduce operando 2: ");
//                    operando2 = sc.nextInt();
//                    solicitarDatos = false;
//                } catch (InputMismatchException ime) {
//                    // Código para tratar el error
//                    System.out.println("Se ha introducido texto en lugar de números. "
//                            + "Vuelva a introducir los datos");
//                    sc.nextLine();
//                }
//            } while (solicitarDatos); // Bucle que controla la excepción
//        } while (!((operando1 > -100 && operando1 < 100)
//                && (operando2 > -100 && operando2 < 100)));

        do {
           
            try {

                // Bloque de código candidato a lanzar la excepción
                System.out.println("Introduce operando 1: ");
                operando1 = sc.nextInt();
                System.out.println("Introduce operando 2: ");
                operando2 = sc.nextInt();
                if ((operando1 > -100 && operando1 < 100) && (operando2 > -100 && operando2 < 100)){
                    solicitarDatos = false;  
                } else{
                    System.out.println("Los datos están fuera de rango");
                }
                
            } catch (InputMismatchException ime) {
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (solicitarDatos);
        
       
        
        sc.nextLine();
        String opcion = "";
        do{
            
            System.out.println("Opciones del programa");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Salir");
            opcion = sc.nextLine();
            
            switch(opcion){
                case "1":
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while(!opcion.equals("3"));
        
    }

}
