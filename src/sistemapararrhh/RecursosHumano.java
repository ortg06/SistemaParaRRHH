/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapararrhh;

import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.utilidades.DepartamentoForm;
import sistemarrhh.utilidades.GestionEmpleado;
import sistemarrhh.utilidades.RegistroEmpleado;

/**
 *
 * @author ortg_
 */
public class RecursosHumano {

    private Scanner sc = new Scanner(System.in);
    private byte flag;
    private byte decision = 0;

    public void gestionRRHH() {

        flag = 0; //variable que permite mostrar de nuevo el menu.

        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Nuevo Empleado");
            System.out.println("2. Gestión por empleado");
            System.out.println("3. Realizar Pagos");
            System.out.println("4. Planilla de Pagos");
            System.out.println("5. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4
                    && decision2 != 5) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("\nSelecciona una opción del menu:");
                System.out.println("1. Nuevo Empleado");
                System.out.println("2. Gestión por empleado");
                System.out.println("3. Realizar Pagos");
                System.out.println("4. Planilla de Pagos");
                System.out.println("5. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    //Instanciamos clase para el registro de empleado
                    RegistroEmpleado rEmpleado = new RegistroEmpleado();
                     {
                        try {
                            rEmpleado.Registro();
                        } catch (SQLException ex) {
                            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 2:
                    GestionEmpleado gEmpleado = new GestionEmpleado();
                    gEmpleado.gestionEmpleado();
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
