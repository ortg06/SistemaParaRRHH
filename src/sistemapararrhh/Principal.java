/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapararrhh;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import sistemarrhh.connections.ConnectionDB;

/**
 *
 * @author ortg_
 */
public class Principal {

    private static Logger log = Logger.getLogger(Principal.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Connection con = ConnectionDB.openConnection();
            log.info("Se ha realizado la conexion a la BD");
            
            PreparedStatement ps = con.prepareStatement("select * from GE_EM_EMPLEADO");
            ResultSet rs = ps.executeQuery();
            log.info("Obteniendo informacion");
           
            while(rs.next()){
                System.out.println("Nombre Empleado:"+rs.getString("EM_NOMBRE"));
            }
            //cerrando objetos y conexion
            log.info("Cerrando conexion");
            rs.close();
            ps.close();
            con.close();
            
          
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
