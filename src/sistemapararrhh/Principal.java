/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapararrhh;

import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import sistemarrhh.connections.ConnectionDB;

/**
 *
 * @author ortg_
 */
public class Principal {

    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Logger log = Logger.getLogger(Principal.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection con = ConnectionDB.openConnection();
            log.info("Se ha realizado la conexion a la BD");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
