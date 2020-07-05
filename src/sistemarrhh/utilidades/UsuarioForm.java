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
import sistemarrhh.dao.UsuarioDao;
import sistemarrhh.entidades.Departamento;
import sistemarrhh.entidades.Usuario;

/**
 *
 * @author ortg_
 */
public class UsuarioForm {

    public void nuevoUsuario() throws SQLException, ClassNotFoundException {

        UsuarioDao usuarioDao = new UsuarioDao();
        Scanner sc = new Scanner(System.in);
        GregorianCalendar gc = new GregorianCalendar();

        //Creando departamento
        System.out.println("---Formulario de nuevo Usuario-----");
        System.out.println("\nCodigo de usuario:");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\nNombre usuario:");
        String nombre = sc.nextLine();
        System.out.println("\nRol del sistema:");
        int rol = Integer.parseInt(sc.nextLine());
        System.out.println("\nCorreo de usuario:");
        String correo = sc.nextLine();
        System.out.println("\nContraseña usuario:");
        String contraseña = sc.nextLine();

        Usuario user = new Usuario(codigo, nombre, rol,correo,contraseña);
        System.out.println("Creando el Usuario " + user.getUsNombre());
        usuarioDao.insertData(user);//Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Usuario : " + user.getUsNombre() + " creado exitosamente");

    }
}