/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
import sistemarrhh.connections.ConnectionDB;

/**
 *
 * @author ortg_
 */
public abstract class AbstractDao<T> {

    public final int LIMIT_RECORDS = 1000;

    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        return ConnectionDB.openConnection();
    }

    protected void closeJDBCObjects(Connection con) throws SQLException {
        ConnectionDB.closeConnection(con);
    }

    protected void closeJDBCObjects(Connection con, Statement st) throws SQLException {
        if (st != null && !st.isClosed()) {
            st.close();
        }
        ConnectionDB.closeConnection(con);
    }

    protected void closeJDBCObjects(Connection con, PreparedStatement ps) throws SQLException {
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        ConnectionDB.closeConnection(con);
    }

    protected void closeJDBCObjects(Connection con, Statement st, ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) 
            rs.close();
        if (st != null && !st.isClosed()) 
            st.close();
        ConnectionDB.closeConnection(con);
    }
    
    protected void closeJDBCObjects(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
        if (rs != null && !rs.isClosed()) 
            rs.close();
        if (ps != null && !ps.isClosed()) 
            ps.close();
        ConnectionDB.closeConnection(con);
    }

    public abstract List<T> getAllData() throws ClassNotFoundException, SQLException;
    
    public abstract T getByIdData(Object id)throws ClassNotFoundException, SQLException;

    public abstract void inserData(T entity) throws ClassNotFoundException, SQLException ;

    public abstract void updateData(T entity) throws ClassNotFoundException, SQLException ;

    public abstract void deleteData(Object id) throws ClassNotFoundException, SQLException ;

}
