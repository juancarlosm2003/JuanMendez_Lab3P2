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
public class casa {

    private int cantidad;
    String pertenece;

    public casa() {
    }

    public casa(int cantidad, String pertenece) {
        this.cantidad = cantidad;
        this.pertenece = pertenece;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPertenece() {
        return pertenece;
    }

    public void setPertenece(String pertenece) {
        this.pertenece = pertenece;
    }

}
