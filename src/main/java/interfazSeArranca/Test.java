/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSeArranca;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Test {
    
    public static void main(String[] args) {
        
        // No se pueden instanciar objetos de interface ni clases abstractas
        Vehiculo v1 = new Turismo(); // Conversión implícita
        Ordenador o1 = new Ordenador();
        SeArranca i1 = new Ordenador();
        SeArranca i2 = v1;
        
        System.out.println(i1.arrancar());
        ArrayList<SeArranca> listaArrancables = new ArrayList<>();
        
        listaArrancables.add(v1);
        o1.setPrecio(100);
        listaArrancables.add(o1);
        listaArrancables.add(new Turismo());
        listaArrancables.add(new Ordenador());
        
        for (SeArranca obj : listaArrancables) {
            obj.arrancar();
            if (obj instanceof Ordenador){
                System.out.println(((Ordenador) obj).getPrecio());
            }
        }
        
    }
    
}
