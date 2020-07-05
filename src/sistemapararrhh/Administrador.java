/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapararrhh;

import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.entidades.Empleado;
import sistemarrhh.utilidades.BuscarEmpleado;
import sistemarrhh.utilidades.CargoForm;
import sistemarrhh.utilidades.DepartamentoForm;
import sistemarrhh.utilidades.GestionDepartamento;
import sistemarrhh.utilidades.RegistroEmpleado;

/**
 *
 * @author ortg_
 */
public class Administrador {

    private Scanner sc = new Scanner(System.in);
    private byte flag;
    private byte decision = 0;

    public void gestionAdmon() {

        flag = 0; //variable que permite mostrar de nuevo el menu.

        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Gestión de Departamentos");
            System.out.println("2. Gestión Estados de empleados");
            System.out.println("3. Gestión de Usuarios");
            System.out.println("4. Gestion de Roles");
            System.out.println("5. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4
                    && decision2 != 5) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("\nSelecciona una opción del menu:");
                System.out.println("1. Gestión de Departamentos");
                System.out.println("2. Gestión Estados de empleados");
                System.out.println("3. Gestión de Usuarios");
                System.out.println("4. Gestion de Roles");
                System.out.println("5. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    GestionDepartamento gdepto = new GestionDepartamento();
                    gdepto.gestionDepto();
                    break;

                case 2:
                    
                    break;
                case 3:
                   
                    break;

                case 4:
                    
                    break;
                case 5:
                    System.out.println("Adios...");
                    exit(0); //Se termina la sesion del sistema
                    break;
            }
        }
    }

}
