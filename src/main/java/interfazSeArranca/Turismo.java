/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSeArranca;

/**
 *
 * @author profesor
 */
public class Turismo extends Vehiculo{
    
    private int numeroPuertas;

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTurismo{" + "numeroPuertas=" + numeroPuertas + '}';
    }

    @Override
    public void repostar(String tipoCombustible) {
        System.out.println("El turismo está repostando " + tipoCombustible);
    }
    
    public boolean arrancar(){
        System.out.println("El turismo ha arrancado...");
        return true;
    }
}
