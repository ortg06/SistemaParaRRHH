/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import sistemarrhh.entidades.Empleado;

/**
 *
 * @author ortg_
 */
public class EmpleadoDao extends AbstractDao<Empleado> {

    @Override
    public List<Empleado> getAllData() throws ClassNotFoundException, SQLException {
        String sql = "Select * from GE_EM_EMPLEADO";
        Connection con = getConnection();
        Statement st = con.createStatement();
        st.setMaxRows(super.LIMIT_RECORDS);
        ResultSet rs = st.executeQuery(sql);

        List<Empleado> empleados = new ArrayList<Empleado>();
        while (rs.next()) {
            empleados.add(
                    new Empleado(rs.getInt("EM_NO_EMPLEADO"),
                            rs.getString("EM_NOMBRE"),
                            rs.getString("EM_APELLIDOS"),
                            rs.getDate("EM_FECHA_NACIMIENTO"),
                            rs.getDate("EM_FECHA_CONTRATADO"),
                            rs.getInt("DP_ID"),
                            rs.getInt("TP_ID"),
                            rs.getInt("ST_ID")
                    ));
        }

        closeJDBCObjects(con, st);
        return empleados;
    }

    @Override
    public void inserData(Empleado entity) throws ClassNotFoundException, SQLException {
        String sql = "insert into GE_EM_EMPLEADO values(?,?,?,?,?,?,?,?)";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, entity.getNoEmpleado());
        ps.setString(2, entity.getNombre());
        ps.setString(3, entity.getApellido());
        ps.setDate(4, entity.getFechaNacimiento());
        ps.setDate(5, entity.getFechaContrato());
        ps.setInt(6, entity.getDpID());
        ps.setInt(7, entity.getTpID());
        ps.setInt(8, entity.getStId());
        ps.execute();
        closeJDBCObjects(con, ps);
    }

    @Override
    public void updateData(Empleado entity) throws ClassNotFoundException, SQLException {
        String sql = "update GE_EM_EMPLEADO set EM_NOMBRE=?,EM_APELLIDOS=?,"
                + "EM_FECHA_NACIMIENTO=?,EM_FECHA_CONTRATADO=?,DP_ID=?,TP_ID=?,ST_ID=? where EM_NO_EMPLEADO=?";

        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, entity.getNombre());
        ps.setString(2, entity.getApellido());
        ps.setDate(3, entity.getFechaNacimiento());
        ps.setDate(4, entity.getFechaContrato());
        ps.setInt(5, entity.getDpID());
        ps.setInt(6, entity.getTpID());
        ps.setInt(7, entity.getStId());
        ps.setInt(8, entity.getNoEmpleado());
        ps.execute();
        closeJDBCObjects(con, ps);
    }

    @Override
    public void deleteData(Object id) throws ClassNotFoundException, SQLException {
        String sql = "delete from GE_EM_EMPLEADO where EM_NO_EMPLEADO=?";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) id);
        ps.execute();
        closeJDBCObjects(con, ps);
    }

    @Override
    public Empleado getByIdData(Object id) throws ClassNotFoundException, SQLException {
        String sql = "select * from GE_EM_EMPLEADO where EM_NO_EMPLEADO=?";
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, (int) id);
        ResultSet rs = ps.executeQuery();
        Empleado e = null;
        if (rs.next()) {
            e=new Empleado(rs.getInt("EM_NO_EMPLEADO"),
                    rs.getString("EM_NOMBRE"),
                    rs.getString("EM_APELLIDOS"),
                    rs.getDate("EM_FECHA_NACIMIENTO"),
                    rs.getDate("EM_FECHA_CONTRATADO"),
                    rs.getInt("DP_ID"),
                    rs.getInt("TP_ID"),
                    rs.getInt("ST_ID")
            );
        }
   closeJDBCObjects(con, ps);
   return e;
    }

}
