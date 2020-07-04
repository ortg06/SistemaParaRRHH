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
import sistemarrhh.dao.UsuarioDao;
import sistemarrhh.entidades.Empleado;
import sistemarrhh.entidades.Usuario;
import sistemarrhh.utilidades.BuscarEmpleado;
import sistemarrhh.utilidades.CargoForm;
import sistemarrhh.utilidades.DepartamentoForm;
import sistemarrhh.utilidades.EnviarCorreo;
import sistemarrhh.utilidades.FuncionCodAleatorio;
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
        UsuarioDao usuarioDao = new UsuarioDao();
        int cod;
        int num;
        String contra;
        Usuario user2 = new Usuario();

        System.out.println("\nInicio de Sesión.");//Muestra Inicio de Sesion Usuario- COntraseña
        System.out.println("\nIngrese codigo de Usuario: ");
        cod = Integer.parseInt(sc.nextLine());
        System.out.println("\nContraseña: ");
        contra = sc.nextLine();

        try {
            user2 = usuarioDao.getByIDData(cod);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Verificamos si el codigo y la contraseña pertenecen al usuario
        while (cod != user2.getUsID() || !user2.getUsContraseña().equals(contra)) {
            System.out.println("Codigo de Usuario o Contraseña Incorrecto");
            exit(0);
        }
        
        /*
        //Enviamos correo para doble factor de verificacion 
        EnviarCorreo correo = new EnviarCorreo(); //Instanciamos la clase EnviarCorreo
        num = FuncionCodAleatorio.getNumeroAleatorio(); //guardamos el numero aleatorio 
        correo.enviarCodigo(user2, num);  //Llammos la funcion enviar codigo con los parametros user y num  aleatorio
        System.out.println("\nPor razones de segurida te hemos enviado un codigo de acceso a tu correo");//mostramos mensaje para verificar la edad
        System.out.println("\nIngresa tu codigo: ");
        int codigo = Integer.parseInt(sc.nextLine());

        if (codigo == num) { //Comprobamos que el codigo enviado al correo sea igual al generado aleatoriamente
            System.out.println("\nRealizaste un Inicio de sesion seguro Bienvenido: " + user2.getUsNombre());
        } else { //si no es el codigo se termina la sesion.
            System.out.println("Lo sentimos, No ingresaste el codigo correcto");
            exit(0); // Se termina la sesion 
        }*/
        
        System.out.println("\n-----BIENVENIDO AL SISTEMA DE RECURSOS HUMANOS-----\n");

        if (user2.getRolID() == 1) {
             System.out.println("\n--Usted posee un rol de Administrador--");
             Administrador admon = new Administrador();
             admon.gestionAdmon();
        } else if (user2.getRolID() == 2) {
             System.out.println("\n--Usted posee un rol de Recursos Humanos--");
             RecursosHumano rrhh= new RecursosHumano();
             rrhh.gestionRRHH();
        }

        
        byte flag = 0; //variable que permite mostrar de nuevo el menu.
/*
        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Consultar todos los empleados.");
            System.out.println("2. Consultar informacion de un empleado");
            System.out.println("3. Ingresar un nuevo empleado");
            System.out.println("4. Gestion de Departamentos");
            System.out.println("5. Gestion de Cargos");
            System.out.println("6. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4
                    && decision2 != 5 && decision2 != 6) { //Validamos que el usuario seleccione una opcion valida (1 o 2)
                System.out.println("\nERROR: SELECCIONE UNA OPCION CORRECTA\n");
                System.out.println("1. Consultar todos los empleados.");
                System.out.println("2. Consultar informacion de un empleado");
                System.out.println("3. Ingresar un nuevo empleado");
                System.out.println("4. Gestion de departamentos");
                System.out.println("5. Gestion de Cargos");
                System.out.println("6. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    try {

                        List<Empleado> empleados = empleadoDao.getAllData();
                        for (Empleado e : empleados) {
                            System.out.println(e);
                        }
                        /*log.info("El nombre actual es: " + e.getNombre());
                        e.setNombre("Oscar");
                        empleadoDao.updateData(e);

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 2:
                    BuscarEmpleado bEmpleado = new BuscarEmpleado();
                    bEmpleado.AccionEmpleado();
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
                    DepartamentoForm nuevoDepto = new DepartamentoForm();
                     {
                        try {
                            nuevoDepto.nuevoDepto();
                        } catch (SQLException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 5:
                    CargoForm gestionCargo = new CargoForm();
                     {
                        try {
                            gestionCargo.nuevoCargo();
                        } catch (SQLException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Adios...");
                    exit(0); //Se termina la sesion del sistema
                    break;
            }*/
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
