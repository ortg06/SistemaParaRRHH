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
    protected Empleado getMappingResults(ResultSet rs) throws SQLException {
       return new Empleado(rs.getInt("EM_NO_EMPLEADO"),
                            rs.getString("EM_NOMBRE"),
                            rs.getString("EM_APELLIDO"),
                            rs.getDate("EM_FECHA_NACIMIENTO"),
                            rs.getDate("EM_FECHA_CONTRATADO"),
                            rs.getInt("Parent_EM_NO_EMPLEADO"),
                            rs.getInt("DP_ID"),
                            rs.getInt("TP_ID"),
                            rs.getInt("ST_ID")
       );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Empleado entity) throws SQLException {
        ps.setInt(1, entity.getNoEmpleado());
        ps.setString(2, entity.getNombre());
        ps.setString(3, entity.getApellido());
        ps.setDate(4, entity.getFechaNacimiento());
        ps.setDate(5, entity.getFechaContrato());
        ps.setString(6, entity.getUsuarioModifica());
        ps.setString(7, entity.getUsuarioCreacion());
        ps.setDate(8, entity.getFechaCreacion());
        ps.setDate(9, entity.getFechaModificacion());
        ps.setInt(10, entity.getSuperior());
        ps.setInt(11, entity.getDpID());
        ps.setInt(12, entity.getTpID());
        ps.setInt(13, entity.getStId()); 
    }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Empleado entity) throws SQLException {
       ps.setInt(1, entity.getNoEmpleado());
        ps.setString(2, entity.getNombre());
        ps.setString(3, entity.getApellido());
        ps.setDate(4, entity.getFechaNacimiento());
        ps.setDate(5, entity.getFechaContrato());
        ps.setString(6, entity.getUsuarioModifica());
        ps.setString(7, entity.getUsuarioCreacion());
        ps.setDate(8, entity.getFechaCreacion());
        ps.setDate(9, entity.getFechaModificacion());
        ps.setInt(10, entity.getSuperior());
        ps.setInt(11, entity.getDpID());
        ps.setInt(12, entity.getTpID());
        ps.setInt(13, entity.getStId()); 
         ps.setInt(14, entity.getNoEmpleado());
    }

    @Override
    protected String getTableName() {
        return "GE_EM_EMPLEADO";
    }

    @Override
    protected String[] getTableColumns() {
        String[] str = {"EM_NO_EMPLEADO", "EM_NOMBRE",
            "EM_APELLIDO",
            "EM_FECHA_NACIMIENTO",
            "EM_FECHA_CONTRATADO",
            "A_USUARIO_MODIFICA",
            "A_USUARIO_CREACION",
            "A_FECHA_CREACION",
            "A_FECHA_MODIFICACION",
            "Parent_EM_NO_EMPLEADO",
            "DP_ID",
            "TP_ID",
            "ST_ID"};
        return str;
        }

        @Override
        protected String getTableKey() {
            return "EM_NO_EMPLEADO";
        }

        @Override
        protected String getSchema() {
            return "BDRRHH";
        }
    }
