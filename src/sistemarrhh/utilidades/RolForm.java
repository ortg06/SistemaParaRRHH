/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.SQLException;
import java.util.Scanner;
import sistemarrhh.dao.RolDao;
import sistemarrhh.entidades.Rol;

/**
 *
 * @author ortg_
 */
public class RolForm {

    public void nuevoRol() throws ClassNotFoundException, SQLException {

        RolDao rolDao = new RolDao();
        Scanner sc = new Scanner(System.in);
        
        
        //Creando departamento
        System.out.println("---Formulario de nuevo Rol-----");
        System.out.println("\nCodigo de Rol:");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\nNombre Rol:");
        String nombre = sc.nextLine();
        
        Rol rol = new Rol(codigo,nombre);
        System.out.println("Creando el Rol " + rol.getRolNombre());
        rolDao.insertData(rol);//Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Rol: " + rol.getRolNombre() + " creado exitosamente");
        
    }

}
