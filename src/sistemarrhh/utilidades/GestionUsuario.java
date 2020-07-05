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

/**
 *
 * @author ortg_
 */
public class GestionUsuario {

    private Scanner sc = new Scanner(System.in);
    private byte flag;
    private byte decision = 0;

    public void gestionUsuario() {
        flag = 0; //variable que permite mostrar de nuevo el menu.

        while (flag == 0) {// while para controlar que se muestre el menu principal
            byte decision2 = 0;

            System.out.println("\nSelecciona una opción del menu:");
            System.out.println("1. Nuevo Usuario");
            System.out.println("2. Editar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            decision2 = Byte.parseByte(sc.nextLine());

            //Validamos que el usuario seleccione una opcion valida 
            while (decision2 != 1 && decision2 != 2 && decision2 != 3 && decision2 != 4) {
                System.out.println("\nSelecciona una opción del menu:");
                System.out.println("1. Nuevo Usuario");
                System.out.println("2. Editar Usuario");
                System.out.println("3. Eliminar Usuario");
                System.out.println("4. Salir");
                decision = Byte.parseByte(sc.nextLine());
            }

            switch (decision2) { //Switch que controla el acceso a las opciones del menu
                case 1:
                    UsuarioForm nuevoUs = new UsuarioForm();
                     {
                        try {
                            nuevoUs.nuevoUsuario();
                        } catch (SQLException ex) {
                            Logger.getLogger(GestionDepartamento.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GestionDepartamento.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 2:
                    EditarUsuarioForm editUser = new EditarUsuarioForm();
                    editUser.editarUsuario();
                    break;
                case 3:
                    EditarUsuarioForm deleteUser = new EditarUsuarioForm();
                    deleteUser.eliminarUsuario();
                    break;
                case 4:
                    flag = 1;
                    break;
            }
        }
    }

}
