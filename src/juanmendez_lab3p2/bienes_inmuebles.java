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
public class bienes_inmuebles {

    String direccion;
    String dimensiones;
    String id;
    private residencial residencial;

    public bienes_inmuebles() {
    }

    public bienes_inmuebles(String direccion, String dimensiones, String id) {
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public residencial getResidencial() {
        return residencial;
    }

    public void setResidencial(residencial residencial) {
        this.residencial = residencial;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "bienes_inmuebles{" + "direccion=" + direccion + ", dimensiones=" + dimensiones + ", id=" + id + '}';
    }

}
