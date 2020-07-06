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
import sistemarrhh.dao.SalarioDao;
import sistemarrhh.entidades.Empleado;
import sistemarrhh.entidades.Salario;

/**
 *
 * @author ortg_
 */
public class AsignarSalario {

    public Scanner sc = new Scanner(System.in);

    public void asignarSalario() throws ClassNotFoundException, SQLException {

        EmpleadoDao empleadoDao = new EmpleadoDao();
        Empleado em = new Empleado();
        SalarioDao salarioDao = new SalarioDao();
        GregorianCalendar fi = new GregorianCalendar();
        GregorianCalendar ff = new GregorianCalendar();
        int cod;
        double salario;
        boolean val = true;

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Empleado: ");
            cod = Integer.parseInt(sc.nextLine());

            try {
                em = empleadoDao.getByIDData(cod);
                if (em == null) {
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

        //sE MOSTRARA EL FORMLARIO PARA ASIGNAR SALARIO
        System.out.println("\n Ingrese el codigo: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\n Ingrese el salario: ");
        salario = Double.parseDouble(sc.nextLine());
        System.out.println("\nFecha de Inicio(AAAA-MM-DD):");
        System.out.println("\nIngrese Año(AAAA):");
        fi.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        fi.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        fi.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        System.out.println("\nFecha de Fin(AAAA-MM-DD):");
        System.out.println("\nIngrese Año(AAAA):");
        ff.set(GregorianCalendar.YEAR, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Mes(MM):");
        ff.set(GregorianCalendar.MONTH, Integer.parseInt(sc.nextLine()));
        System.out.println("\nIngrese Dia(DD):");
        ff.set(GregorianCalendar.DATE, Integer.parseInt(sc.nextLine()));
        
        //SE CREA NUEVO SALARIO CON LA ENTIDAD
       Salario nuevo = new Salario(codigo,salario,new Date(fi.getTimeInMillis()),
               new Date(ff.getTimeInMillis())," ",new Date(new GregorianCalendar().getTimeInMillis()),
               " ",new Date(new GregorianCalendar().getTimeInMillis()),em.getNoEmpleado()
       );
        System.out.println("Asignando Salario al empleado: "+em.getNombre()+" "+em.getApellido());
        salarioDao.insertData(nuevo); //Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Salario de: $" + nuevo.getMonto() +"asignado al Empleado "+em.getNombre()+" "+em.getApellido());
    }

}
