/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajadorHerencia;

import java.util.ArrayList;

/**
 *
 * @author profesor
 */
public class Prueba {
    
    public static void main(String[] args) {
        Camarero c1 = new Camarero("jefe de sección", "Manuel", "Fdez", "123ddf");
        Camarero c2 = new Camarero("Sumiller");
        Cocinero co1 = new Cocinero("Postres", "Luisa", "Pérez", "ddd");
        Trabajador t1 = new Trabajador("Paco", "El chocolatero", "fgdfgd5");
        
//        System.out.println(c1);
//        System.out.println(co1);
//        System.out.println(t1);
//        
//        c1.cotizar();
//        co1.cotizar();
//        t1.cotizar();
        
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
        listaTrabajadores.add(t1); 
        listaTrabajadores.add(c1); // Conversión implícita
        listaTrabajadores.add(co1); // Conversión implícita
        
        for (Trabajador t : listaTrabajadores) {
            System.out.println(t);
            t.cotizar();
            
            // Si t es una instancia de Camarero
            if (t instanceof Camarero){
                Camarero aux = (Camarero) t; // Conversión explícita
                aux.servirMesa("4");
            }
            
            if (t instanceof Cocinero){
                ((Cocinero) t).prepararPlato("Pushhero");
            }
        }
    }
    
}
