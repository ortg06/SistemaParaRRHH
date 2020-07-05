/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.dao.DepartamentoDao;
import sistemarrhh.entidades.Departamento;

/**
 *
 * @author ortg_
 */
public class EditarDeptoForm {

    public void editarDepto() {

        DepartamentoDao deptoDao = new DepartamentoDao();
        Departamento depto = new Departamento();
        Scanner sc = new Scanner(System.in);
        int cod;
        boolean val = true;

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Departamento: ");
            cod = Integer.parseInt(sc.nextLine());

            try {
                depto = deptoDao.getByIDData(cod);
                if (depto == null) {
                    val = true;
                    System.out.println("El ID no se encuentra en nuestros registros");
                } else {
                    val = false;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Creando departamento
        System.out.println("---Formulario de modificacion de deptartamento-----");
        System.out.println("\nNombre depto:");
        String nombre = sc.nextLine();
        depto.setDpNombre(nombre);

        System.out.println("Modificando Departamento...");
        try {
            deptoDao.updateData(depto); //Se eejecuta el metodo insert que ejecuta el sql
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarEmpleadoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EditarEmpleadoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos del departamento actualizados exitosamente");
    }

    public void eliminarDepto() {

        DepartamentoDao deptoDao = new DepartamentoDao();
        Departamento depto = new Departamento();
        Scanner sc = new Scanner(System.in);
        int cod;
        boolean val = true;

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Departamento: ");
            cod = Integer.parseInt(sc.nextLine());

            try {
                depto = deptoDao.getByIDData(cod);
                if (depto == null) {
                    val = true;
                    System.out.println("El ID no se encuentra en nuestros registros");
                } else {
                    val = false;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        byte d = 0;
        System.out.println("\n ¿Esta seguro de Eliminar el departamento: "
                + " " + depto.getDpNombre() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {
            try {
                deptoDao.deleteData(depto.getDpID());
                System.out.println("Se elimino el departamento con Exito");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
