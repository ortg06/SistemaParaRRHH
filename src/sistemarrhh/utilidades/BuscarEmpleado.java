/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.util.Scanner;
import sistemarrhh.dao.EmpleadoDao;
import sistemarrhh.entidades.Empleado;

/**
 *
 * @author ortg_
 */
public class BuscarEmpleado {
    
    Scanner sc = new Scanner(System.in);
    EmpleadoDao empleadoDao = new EmpleadoDao();
    
    
    public void AccionEmpleado(){
        try{
                        System.out.println("\nDigite el ID del empleado a buscar: ");
                        int buscarPor = Integer.parseInt(sc.nextLine());
                        System.out.println("Obteniendo empleado con ID:"+buscarPor);
                        Empleado e = empleadoDao.getByIDData(buscarPor);
                                
                        if(e == null){
                            System.out.println("El ID no se encuentra en nuestros registros");
                        }else{
                        System.out.println(e);
                        }
                    }catch (Exception ex) {
                        ex.printStackTrace();
                    }
        
    }
    
    
}
