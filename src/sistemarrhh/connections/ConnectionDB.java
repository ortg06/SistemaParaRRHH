/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author ortg_
 */
public class ConnectionDB {

    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection con) throws SQLException{
        if(con!=null && !con.isClosed()){
            con.close();
        }
    }
}


