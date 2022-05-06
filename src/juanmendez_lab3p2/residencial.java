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
public class residencial {

    casa casa;
    edificio edificio;
    apartamento apartamento;

    public residencial() {
    }

    public residencial(casa casa, edificio edificio, apartamento apartamento) {
        this.casa = casa;
        this.edificio = edificio;
        this.apartamento = apartamento;
    }

    public casa getCasa() {
        return casa;
    }

    public void setCasa(casa casa) {
        this.casa = casa;
    }

    public edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(edificio edificio) {
        this.edificio = edificio;
    }

    public apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(apartamento apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public String toString() {
        return "residencial{" + "casa=" + casa + ", edificio=" + edificio + ", apartamento=" + apartamento + '}';
    }

}
