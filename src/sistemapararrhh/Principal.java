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
import java.util.ArrayList;
import java.util.List;
import sistemarrhh.connections.ConnectionDB;
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;

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
            EmpleadoDao empleadoDao = new EmpleadoDao();
            List<Empleado> empleados = empleadoDao.getAllData();
            for(Empleado e: empleados){
               log.info(e.toString());
            }
            
            log.info("Obteniendo empleado con ID: 1");
            Empleado e = empleadoDao.getByIdData(1);
            
            log.info("El nombre actual es: "+e.getNombre());
            e.setNombre("Oscar");
            empleadoDao.updateData(e);
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
