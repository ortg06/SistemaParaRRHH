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
import sistemarrhh.dao.DepartamentoDao;
import sistemarrhh.entidades.Departamento;

/**
 *
 * @author ortg_
 */
public class DepartamentoForm {
    
    public void nuevoDepto()throws SQLException, ClassNotFoundException {
    
    DepartamentoDao departamentoDao = new DepartamentoDao();
    Scanner sc = new Scanner(System.in);
    GregorianCalendar gc = new GregorianCalendar();
    
    
        //Creando departamento
        System.out.println("---Formulario de nuevo depto-----");
        System.out.println("\nCodigo de depto:");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\nNombre depto:");
        String nombre = sc.nextLine();
        
        Departamento dpto = new Departamento(codigo,nombre,"Usuario"," ",
                new Date(gc.getTimeInMillis()),new Date(gc.getTimeInMillis()));
         System.out.println("Creando el Departamento " + dpto.getDpNombre());
        departamentoDao.insertData(dpto);//Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Departamento: " + dpto.getDpNombre() + " creado exitosamente");
        
        
    }
}
