/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.utilidades;

import java.sql.SQLException;
import java.util.Scanner;
import sistemarrhh.dao.CargoDao;
import sistemarrhh.entidades.Cargo;

/**
 *
 * @author ortg_
 */
public class CargoForm {
    
  public void nuevoCargo()throws SQLException, ClassNotFoundException{
      
      CargoDao cargoDao = new CargoDao();
      Scanner sc = new Scanner(System.in);
      
      
        //Creando departamento
        System.out.println("---Formulario de nuevo cargo-----");
        System.out.println("\nCodigo de cargo:");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("\nNombre cargo:");
        String nombre = sc.nextLine();
        System.out.println("\nCodigo de departamento:");
        int codigoDepto = Integer.parseInt(sc.nextLine());
        
        Cargo cargo = new Cargo(codigo,nombre,codigoDepto);
         System.out.println("HOLA ANDRE " + cargo.getCaNombre());
        cargoDao.insertData(cargo);//Se eejecuta el metodo insert que ejecuta el sql
        System.out.println("Cargo: " +  cargo.getCaNombre() + " creado exitosamente");
      
  }
    
}
