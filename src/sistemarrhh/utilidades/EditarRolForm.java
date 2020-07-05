/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.dao.RolDao;
import sistemarrhh.entidades.Rol;

/**
 *
 * @author ortg_
 */
public class EditarRolForm {

    RolDao rolDao = new RolDao();
    Rol rol = new Rol();
    Scanner sc = new Scanner(System.in);
    int cod;
    boolean val = true;

    public void editarRol() throws ClassNotFoundException, SQLException {

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Departamento: ");
            cod = Integer.parseInt(sc.nextLine());

            rol = rolDao.getByIDData(cod);
            if (rol == null) {
                val = true;
                System.out.println("El ID no se encuentra en nuestros registros");
            } else {
                val = false;
            }

        }

        //Creando departamento
        System.out.println("---Formulario de modificacion de Rol-----");
        System.out.println("\nNombre rol:");
        String nombre = sc.nextLine();
        rol.setRolNombre(nombre);

        System.out.println("Modificando Rol...");

        rolDao.updateData(rol); //Se eejecuta el metodo insert que ejecuta el sql

        System.out.println("Datos del Rol actualizados exitosamente");
    }

    public void elimarRol() throws ClassNotFoundException, SQLException {

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Departamento: ");
            cod = Integer.parseInt(sc.nextLine());

            rol = rolDao.getByIDData(cod);
            if (rol == null) {
                val = true;
                System.out.println("El ID no se encuentra en nuestros registros");
            } else {
                val = false;
            }

        }

        byte d = 0;
        System.out.println("\n ¿Esta seguro de Eliminar el Rol "
                + " " + rol.getRolNombre() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {

            rolDao.deleteData(rol.getRolID());
            System.out.println("Se elimino el Rol con Exito");

        }
    }
}
