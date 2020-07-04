/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.Date;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import sistemarrhh.entidades.Empleado;
import sistemarrhh.dao.EmpleadoDao;

/**
 *
 * @author ortg_
 */
public class RegistroEmpleado {

  

    public void Registro() throws SQLException, ClassNotFoundException {

        //Se instancia las clases que ocuparemos
        EmpleadoDao empleadoDao = new EmpleadoDao();
        Scanner sc = new Scanner(System.in);
        GregorianCalendar fn = new GregorianCalendar();
        GregorianCalendar fc = new GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar();

        
        //Creando un empleado
        System.out.println("---Formulario de nuevo empleado-----");
        System.out.println("\nCodigo de Empleado:");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\nNombre Empleado:");
        String nombre = sc.nextLine();
        System.out.println("\nApellido Empleado:");
        String apellido = sc.nextLine();
        System.out.println("\nFecha de Nacimiento(AAAA-MM-DD):");
        System.out.println("\nIngrese Año(AAAA):");
        fn.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        fn.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        fn.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        System.out.println("\nFecha de Contratación(AAAA-MM-DD):");
        System.out.println("\nIngrese Año(AAAA):");
        fc.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        fc.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        fc.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        System.out.println("\nCodigo de Jefe:");
        int codSuperior = Integer.parseInt(sc.nextLine());
        System.out.println("\nDepartamento:");
        int codDepto = Integer.parseInt(sc.nextLine());
        System.out.println("\nPuesto:");
        int codPuesto = Integer.parseInt(sc.nextLine());
        System.out.println("\nEstatus:");
        int codEstatus = Integer.parseInt(sc.nextLine());
        
        //Insertamos el nuevo empleado en un nuevo objeto con cada parametro ingresado.
        Empleado nuevo = new Empleado(codigo, nombre, apellido, new Date(fn.getTimeInMillis()), new Date(fc.getTimeInMillis()),
                 "Usuario", " ", new Date(gc.getTimeInMillis()), new Date(new GregorianCalendar().getTimeInMillis()), 
                codSuperior, codDepto, codPuesto, codEstatus);
        System.out.println("Creando el empleado " + nuevo.getNombre()+nuevo.getApellido());
        empleadoDao.insertData(nuevo); //Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Empleado" + nuevo.getNombre() + nuevo.getApellido() + " creado exitosamente");
    }

}
