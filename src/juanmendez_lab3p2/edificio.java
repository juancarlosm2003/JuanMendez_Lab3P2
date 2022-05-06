/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab3p2;

/**
 *
 * @author Juan Carlos Mendez
 */
public class edificio {

    public int numero;
    String nombre;

    public edificio() {
    }

    public edificio(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "edificio{" + "numero=" + numero + ", nombre=" + nombre + '}';
    }

}
