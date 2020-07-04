/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapararrhh;


import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;
import sistemarrhh.utilidades.RegistroEmpleado;

/**
 *
 * @author ortg_
 */
public class Principal {

    private static final Logger log = Logger.getLogger(Principal.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte decision = 0;
        EmpleadoDao empleadoDao = new EmpleadoDao();

        System.out.println("\n-----BIENVENIDO AL SISTEMA DE RECURSOS HUMANOS-----\n");

        byte flag = 0; //variable que permite mostrar de nuevo el menu.

        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Consultar todos los empleados.");
            System.out.println("2. Consultar informacion de un empleado");
            System.out.println("3. Ingresar un nuevo empleado");
            System.out.println("4. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("\nERROR: SELECCIONE UNA OPCION CORRECTA\n");
                System.out.println("1. Consultar todos los empleados.");
                System.out.println("2. Consultar informacion de un empleado");
                System.out.println("3. Ingresar un nuevo empleado");
                System.out.println("4. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    try {
                       
                        List<Empleado> empleados = empleadoDao.getAllData();
                        for (Empleado e : empleados) {
                            System.out.println(e);
                        }
                       /* log.info("El nombre actual es: " + e.getNombre());
                        e.setNombre("Oscar");
                        empleadoDao.updateData(e);*/

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    try{
                        System.out.println("\nDigite el ID del empleado a buscar: ");
                        int buscarPor = Integer.parseInt(sc.nextLine());
                        System.out.println("Obteniendo empleado con ID:"+buscarPor);
                        Empleado e = empleadoDao.getByIDData(buscarPor);
                                
                        if(e == null){
                            System.out.println("El ID no se encuentra en nuestros registros");
                        }else{
                        System.out.println(e);
                        }
                    }catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    RegistroEmpleado registro = new RegistroEmpleado();
                {
                    try {
                        registro.Registro();
                    } catch (SQLException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case 4:
                    System.out.println("Adios...");
                    exit(0); //Se termina la sesion del sistema
                    break;
            }
            System.out.println("\n¿Desea volver al menu principal? \n1:SI  2:Salir"); //Opciones para mostrar de nuevo el menu 
            flag = Byte.parseByte(sc.nextLine());
            while (flag != 1 && flag != 2) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("Seleccione una opcion valida: 1-SI 2-Salir");
                decision = Byte.parseByte(sc.nextLine());
            }
            switch (flag) {
                case 1:
                    flag = 0; //Seteamos la variable a 0 para que vuelva a mostrar menu principal
                    break;
                case 2:
                    exit(0); //Sino terminamos la sesion
                    break;
            }
        }

    }

}
