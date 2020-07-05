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
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;

/**
 *
 * @author ortg_
 */
public class GestionEstatus {

    private Scanner sc = new Scanner(System.in);
    private byte flag;
    private byte decision = 0;
    EmpleadoDao empleadoDao = new EmpleadoDao();
    Empleado em = new Empleado();

    public void gestionEstatus() throws ClassNotFoundException, SQLException {
        flag = 0; //variable que permite mostrar de nuevo el menu.
        int cod;
        boolean val = true;

        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Activar Empleado");
            System.out.println("2. Desactivar Empleado");
            System.out.println("2. Suspender ");
            System.out.println("3. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            //Validamos que el usuario seleccione una opcion valida 
            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4) {
                System.out.println("\nSelecciona una opción del menu:");
                System.out.println("1. Activar Empleado");
                System.out.println("2. Desactivar Empleado");
                System.out.println("2. Suspender ");
                System.out.println("3. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            while (val == true) {
                System.out.println("\n Ingrese el codigo de Empleado: ");
                cod = Integer.parseInt(sc.nextLine());

                em = empleadoDao.getByIDData(cod);
                if (em == null) {
                    val = true;
                    System.out.println("El ID no se encuentra en nuestros registros");
                } else {
                    val = false;
                }

            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    activar(em);
                    break;
                case 2:
                    desactivar(em);
                    break;
                case 3:
                    Suspender(em);
                    break;
                case 4:

                    break;
            }
        }
    }

    public void activar(Empleado em) throws ClassNotFoundException, SQLException {
        byte d = 0;
        System.out.println("\n ¿Esta seguro de Activar al Empleado: "
                + "" + em.getNombre() + " " + em.getApellido() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {
            em.setStId(1);

            empleadoDao.updateData(em);
            System.out.println("Se dio activo el empleado con Exito");

        }
    }

    public void desactivar(Empleado em) throws ClassNotFoundException, SQLException {
        byte d = 0;
        System.out.println("\n ¿Esta seguro de Inactivar al Empleado: "
                + "" + em.getNombre() + " " + em.getApellido() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {
            em.setStId(2);

            empleadoDao.updateData(em);
            System.out.println("Se dio de baja el empleado con Exito");

        }
    }

    private void Suspender(Empleado em) throws ClassNotFoundException, SQLException {
        byte d = 0;
        System.out.println("\n ¿Esta seguro de cambiar el estado: 'En vacacion' al Empleado: "
                + "" + em.getNombre() + " " + em.getApellido() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {
            em.setStId(3);

            empleadoDao.updateData(em);
            System.out.println("Se actualizo el estado del empleado con Exito");

        }
    }

}
