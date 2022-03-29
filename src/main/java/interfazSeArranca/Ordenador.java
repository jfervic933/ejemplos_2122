/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSeArranca;

/**
 *
 * @author profesor
 */
public class Ordenador implements SeArranca, SePara{
    
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    @Override
    public boolean arrancar() {
     
        System.out.println("El ordenador está arrancado");
        return true;
    }

    @Override
    public boolean parar() {
        System.out.println("Parando el ordenador");
        return false;
    }
    
    
}
