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
public class apartamento extends edificio {

    int numerolocal;
    String referencia;

    public apartamento() {
        super();
    }

    public apartamento(int numerolocal, String referencia) {
        this.numerolocal = numerolocal;
        this.referencia = referencia;
    }

}
