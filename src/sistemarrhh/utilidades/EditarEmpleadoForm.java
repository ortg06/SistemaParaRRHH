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
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;

/**
 *
 * @author ortg_
 */
public class EditarEmpleadoForm {
    
    public void editarEm(Empleado em){
        
         //Se instancia las clases que ocuparemos
        EmpleadoDao empleadoDao = new EmpleadoDao();
        Scanner sc = new Scanner(System.in);
        GregorianCalendar fn = new GregorianCalendar();
        GregorianCalendar fc = new GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar();

        
        //Formulario Editando un empleado
        System.out.println("---Formulario modificar datos de empleado-----");
        System.out.println("\nNombre Empleado:");
        String nombre = sc.nextLine();
        em.setNombre(nombre);
        System.out.println("\nApellido Empleado:");
        String apellido = sc.nextLine();
        em.setApellido(apellido);
        System.out.println("\nFecha de Nacimiento(AAAA-MM-DD):");
        System.out.println("\nIngrese Año(AAAA):");
        fn.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        fn.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        fn.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        System.out.println("\nFecha de Contratación(AAAA-MM-DD):");
        em.setFechaNacimiento(new Date(fn.getTimeInMillis()));
        System.out.println("\nIngrese Año(AAAA):");
        fc.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        fc.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        fc.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        em.setFechaContrato(new Date(fc.getTimeInMillis()));
        System.out.println("\nCodigo de Jefe:");
        int codSuperior = Integer.parseInt(sc.nextLine());
        em.setSuperior(codSuperior);
        System.out.println("\nDepartamento:");
        int codDepto = Integer.parseInt(sc.nextLine());
        em.setDpID(codDepto);
        System.out.println("\nPuesto:");
        int codPuesto = Integer.parseInt(sc.nextLine());
        em.setTpID(codPuesto);
        System.out.println("\nEstatus:");
        int codEstatus = Integer.parseInt(sc.nextLine());
        em.setStId(codEstatus);
        
             
        System.out.println("Modificando Empleado...");
        try {
            empleadoDao.updateData(em); //Se eejecuta el metodo update que ejecuta el sql
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarEmpleadoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EditarEmpleadoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos del Empleado: " + em.getNombre() + em.getApellido() + " Actualizados exitosamente");    
        
    }
    
}
