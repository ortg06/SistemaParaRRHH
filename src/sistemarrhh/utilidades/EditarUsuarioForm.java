/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistemarrhh.dao.UsuarioDao;
import sistemarrhh.entidades.Usuario;

/**
 *
 * @author ortg_
 */
public class EditarUsuarioForm {

    public void editarUsuario() {

        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario user = new Usuario();
        Scanner sc = new Scanner(System.in);
        int cod;
        boolean val = true;

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Usuario: ");
            cod = Integer.parseInt(sc.nextLine());

            try {
                user = usuarioDao.getByIDData(cod);
                if (user == null) {
                    val = true;
                    System.out.println("El ID no se encuentra en nuestros registros");
                } else {
                    val = false;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Creando departamento
        System.out.println("---Formulario de modificacion de Usuario-----");
        System.out.println("\nNombre depto:");
        String nombre = sc.nextLine();
        user.setUsNombre(nombre);
        System.out.println("\nRol del sistema:");
        int rol = Integer.parseInt(sc.nextLine());
        user.setRolID(rol);
        System.out.println("\nCorreo de usuario:");
        String correo = sc.nextLine();
        user.setUsCorreo(correo);
        System.out.println("\nContraseña usuario:");
        String contraseña = sc.nextLine();
        user.setUsContraseña(contraseña);

        System.out.println("Modificando Usuario...");
        try {
            usuarioDao.updateData(user); //Se eejecuta el metodo insert que ejecuta el sql
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Datos del usuario actualizados exitosamente");
    }

    public void eliminarUsuario() {

        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario user = new Usuario();
        Scanner sc = new Scanner(System.in);
        int cod;
        boolean val = true;

        while (val == true) {
            System.out.println("\n Ingrese el codigo de Usuario: ");
            cod = Integer.parseInt(sc.nextLine());

            try {
                user = usuarioDao.getByIDData(cod);
                if (user == null) {
                    val = true;
                    System.out.println("El ID no se encuentra en nuestros registros");
                } else {
                    val = false;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        byte d = 0;
        System.out.println("\n ¿Esta seguro de Eliminar el usuario: "
                + " " + user.getUsNombre() + "?");
        System.out.println("\n1. SI  2.NO");
        d = Byte.parseByte(sc.nextLine());
        if (d == 1) {
            try {
                usuarioDao.deleteData(user.getUsID());
                System.out.println("Se elimino el usuario con Exito");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(EditarUsuarioForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
