/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Arithmetic {

    public static void main(String[] args) {

        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce n1: ");
            numero1 = teclado.nextInt();

            System.out.println("Introduce n2: ");
            numero2 = teclado.nextInt();

        } catch (InputMismatchException ime){
            System.out.println("Cuidado pecador, te has equivocado");
        }
                
                
                
//        int division = numero1 / numero2;
//
//            System.out.println("Resultado: " + division);

        }

    }
