/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_lab3p2;

import java.util.ArrayList;
import java.util.Iterator;
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
        bienes_inmuebles b = new bienes_inmuebles(); 
        ArrayList cliente = new ArrayList();
        ArrayList residencia = new ArrayList();
        int opcion = 1;
        while (opcion != 5) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("Sistema de bienes raices \n"
                            + "1.- Administracion de clientes \n"
                            + "2.- Administrador de bienes inmuebles \n")
            );

            if (opcion == 1) {
                int o = 1;
                while (o != 4) {
                    int op = Integer.parseInt(JOptionPane.showInputDialog("Sistema de administracion de clientes \n"
                            + "1.- Crear cliente. \n"
                            + "2.- Enlistar cliente  \n"
                            + "3.- Eliminar cliente \n"
                            + "4.- Salir del sistema de gestion de cliente")
                    );
                    if (op == 1) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente: "));
                        String idregistro = JOptionPane.showInputDialog("Ingrese el id de registro del cliente: ");
                        String usuario = JOptionPane.showInputDialog("Ingrese el id de registro del cliente: ");
                        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña del cliente: ");
                        cliente.add(new Cliente(nombre, edad, idregistro, usuario, contraseña));
                    } else {
                        if (op == 2) {
                            Iterator i = cliente.iterator();
                            while (i.hasNext()) {
                                Object next = i.next();
                                System.out.println("posicion del cliente:" + i + "datos: " + next);

                            }
                        } else {
                            if (op == 3) {
                                int remove = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea eliminar del cliente: "));
                                cliente.remove(remove);
                                JOptionPane.showConfirmDialog(null, "Cliente eliminado existosamente ");
                            }
                        }
                    }
                }
            } else {
                if (opcion == 2) {
                    String direc = JOptionPane.showInputDialog("Ingrese la direccion del inmueble");
                    b.setDireccion(direc);
                    String dimension = JOptionPane.showInputDialog("Ingrese la direccion del inmueble: ");
                    b.setDimensiones(dimension);
                    String id = JOptionPane.showInputDialog("Ingrese el ID del inmueble");
                    b.setId(id);
                    residencia.add(new bienes_inmuebles(direc,dimension, id));
                }
            }
        }
    }

}
