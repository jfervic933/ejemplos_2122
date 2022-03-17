/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajadorHerencia;

/**
 *
 * @author profesor
 */
public class Camarero extends Trabajador {
    
    private String rango;

    public Camarero(String rango, String nombre, String apellido, String nif) {
        super(nombre, apellido, nif);
        this.rango = rango;
    }

    public Camarero() {
        //super();
    }

    public Camarero(String rango){
        //super();
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Camarero{" + "rango=" + rango + '}';
    }
    
    @Override
    public void cotizar(){
        System.out.println("Cotizando como un camarero");
    }
    
    public void servirMesa(String id){
        System.out.println("Camarero sirviendo la mesa " + id);
    }
}
