/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemarrhh.entidades.Salario;

/**
 *
 * @author ortg_
 */
public class SalarioDao extends AbstractDao<Salario>{

    @Override
    protected Salario getMappingResults(ResultSet rs) throws SQLException {
        return new Salario(
                rs.getInt("ID_SALARIOS"),
                rs.getDouble("SL_MONTO"),
                rs.getDate("SL_FECHA_INICIO"),
                rs.getDate("SL_FECHA_FINAL"),
                rs.getInt("EM_NO_EMPLEADO")
       );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Salario entity) throws SQLException {
        ps.setInt(1, entity.getNoEmpleado());
        ps.setDouble(2, entity.getMonto());
        ps.setDate(3, entity.getSlFechaInicio());
        ps.setDate(4, entity.getSlFechaFIN());
        ps.setString(5, entity.getUsuarioModifica());
        ps.setDate(6, entity.getFechaCreacion());
        ps.setString(7, entity.getUsuarioCreacion());
        ps.setDate(8, entity.getFechaModificacion());
        ps.setInt(9, entity.getNoEmpleado()); 
    }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Salario entity) throws SQLException {
        ps.setInt(1, entity.getNoEmpleado());
        ps.setDouble(2, entity.getMonto());
        ps.setDate(3, entity.getSlFechaInicio());
        ps.setDate(4, entity.getSlFechaFIN());
        ps.setString(5, entity.getUsuarioModifica());
        ps.setDate(6, entity.getFechaCreacion());
        ps.setString(7, entity.getUsuarioCreacion());
        ps.setDate(8, entity.getFechaModificacion());
        ps.setInt(9, entity.getNoEmpleado()); 
        ps.setInt(1, entity.getNoEmpleado());
    }

    @Override
    protected String getTableName() {
       return "GE_SL_SALARIO";
    }

    @Override
    protected String[] getTableColumns() {
       String[] str = {
            "ID_SALARIOS",
            "SL_MONTO",
            "SL_FECHA_INICIO",
            "SL_FECHA_FINAL",
            "A_USUARIO_MODIFICA",
            "A_FECHA_CREACION",
            "A_USUARIO_CREACION",
            "A_FECHA_MODIFICACION",
            "EM_NO_EMPLEADO"};
        return str;
    }

    @Override
    protected String getTableKey() {
        return "ID_SALARIOS";
    }

    @Override
    protected String getSchema() {
        return "BDRRHH";
    }
    
}
