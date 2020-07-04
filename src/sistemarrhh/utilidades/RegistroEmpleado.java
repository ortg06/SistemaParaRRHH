/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.Date;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import sistemarrhh.entidades.Empleado;
import java.util.logging.Logger;
import sistemarrhh.dao.EmpleadoDao;

/**
 *
 * @author ortg_
 */
public class RegistroEmpleado {
    
     private static Logger log = Logger.getLogger(RegistroEmpleado.class.getName());
     
    public void Registro() throws SQLException, ClassNotFoundException{
        
           EmpleadoDao empleadoDao = new EmpleadoDao();
          //Creando un empleado
           GregorianCalendar gc = new GregorianCalendar();
           gc.set(GregorianCalendar.DATE, 01);
           gc.set(GregorianCalendar.MONTH, 11);
           gc.set(GregorianCalendar.YEAR, 1988);
           
           Empleado nuevo = new Empleado(3,"Juan","Perez",new Date(gc.getTimeInMillis()),new Date(gc.getTimeInMillis())
                   , "Usuario", " ", new Date(gc.getTimeInMillis()),new Date(new GregorianCalendar().getTimeInMillis()),1,1,1,1);
           log.info("Creando el empleado " + nuevo);
           empleadoDao.insertData(nuevo);
           log.info("Empleado creado exitosamente");
    }
    
    
}
