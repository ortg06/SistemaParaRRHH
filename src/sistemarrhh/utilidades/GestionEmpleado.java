/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemapararrhh.Principal;
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;

/**
 *
 * @author ortg_
 */
public class GestionEmpleado {

    public Scanner sc = new Scanner(System.in);
    private byte flag;
    private byte decision = 0;

    public void gestionEmpleado() {

        int cod;

        System.out.println("\n Ingrese el codigo de Empleado: ");
        cod = Integer.parseInt(sc.nextLine());
        EmpleadoDao empleadoDao = new EmpleadoDao();
        Empleado em = new Empleado();
        
        try {
            em = empleadoDao.getByIDData(cod);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        flag = 0; //variable que permite mostrar de nuevo el menu.
        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Editar Datos de Empleado");
            System.out.println("2. Dar de baja");
            System.out.println("3. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            while (decision2 != 1 && decision2 != 2 && decision2 != 3) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("\nSelecciona una opción del menu:");
                System.out.println("1. Editar Datos de Empleado");
                System.out.println("2. Dar de baja");
                System.out.println("3. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    EditarEmpleadoForm eEmpleado = new EditarEmpleadoForm();
                    eEmpleado.editarEm(em);
                    break;

                case 2:
                    byte d =0;
                    System.out.println("\n ¿Esta seguro de Inactivar al Empleado: "
                            + ""+em.getNombre()+" "+em.getApellido()+"?");
                    System.out.println("\n1. SI  2.NO");
                    d=Byte.parseByte(sc.nextLine());
                    if(d == 1){
                    em.setStId(2);
                try {
                    empleadoDao.updateData(em);
                    System.out.println("Se dio de baja el empleado con Exito");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
                    break;
                case 3:
                    flag = 1;
                    break;
            }
        }

    }

}
