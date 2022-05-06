/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab3p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos Mendez
 */
public class JuanMendez_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcion = 1;
        ArrayList jugadores = new ArrayList();
        while (opcion != 5) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("Sistema de bienes raices \n"
                            + "1.- Ingresar o eliminar clientes \n"
                            + "2.- administrar casas\n "
                            + "3.- Administrar departamento\n"
                            + "4.- Administrar edificio \n"
                            + "5.- Salir del sistema \n")
            );
            if (opcion == 1){
                
            }
        }
    }
    
}
