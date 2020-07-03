/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.connections;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.Properties;
import sistemarrhh.propiedades.ConfigProperties;
import sistemarrhh.utilidades.EncriptacionTexto;

/**
 *
 * @author ortg_
 */
public class ConnectionDB {

    //Se declaran las instancias de clases
    private static final EncriptacionTexto encriptacionTexto = new EncriptacionTexto();//Instancia de EncriptacionTexto
    private static Properties propiedades = new Properties();

    //Se declaran las variables que se ocuparan    
    private static final String NOMBRE_ARCHIVO_PROPS = "config.properties";
    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection openConnection() throws ClassNotFoundException, SQLException {

        propiedades = new Properties(); //Instancia de Properties
        try {
            propiedades.load(ConfigProperties.getResourceAsInputStream(NOMBRE_ARCHIVO_PROPS));
        } catch (IOException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se obtienen las variables para la conexion.
        URL = encriptacionTexto.getTextoDesencriptado(propiedades.getProperty("uBD"));
        USER = encriptacionTexto.getTextoDesencriptado(propiedades.getProperty("usBD"));
        PASSWORD = encriptacionTexto.getTextoDesencriptado(propiedades.getProperty("uPBD"));

        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection con) throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
