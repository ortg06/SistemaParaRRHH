/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemarrhh.entidades.Departamento;

/**
 *
 * @author ortg_
 */
public class DepartamentoDao extends AbstractDao<Departamento>{

    @Override
    protected Departamento getMappingResults(ResultSet rs) throws SQLException {
        return new Departamento(rs.getInt("DP_ID"),
                            rs.getString("DP_NOMBRE")
        );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Departamento entity) throws SQLException {
            ps.setInt(1, entity.getDpID());
            ps.setString(2, entity.getDpNombre());
            ps.setString(3, entity.getUsuarioModifica());
            ps.setString(4, entity.getUsuarioCreacion());
            ps.setDate(5, entity.getFechaCreacion());
            ps.setDate(6, entity.getFechaModificacion());
       }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Departamento entity) throws SQLException {
            ps.setInt(1, entity.getDpID());
            ps.setString(2, entity.getDpNombre());
            ps.setString(3, entity.getUsuarioCreacion());
            ps.setString(4, entity.getUsuarioModifica());
            ps.setDate(5, entity.getFechaCreacion());
            ps.setDate(6, entity.getFechaModificacion());
            ps.setInt(7, entity.getDpID());
    }

    @Override
    protected String getTableName() {
       return "GE_DP_DEPARTAMENTO";
    }

    @Override
    protected String[] getTableColumns() {
         String[] str = {"DP_ID",
            "DP_NOMBRE",
            "A_USUARIO_MODIFICA",
            "A_USUARIO_CREACION",
            "A_FECHA_CREACION",
            "A_FECHA_MODIFICACION",
            };
        return str;
    }

    @Override
    protected String getTableKey() {
       return "DP_ID";
    }

    @Override
    protected String getSchema() {
        return "BDRRHH";
    }
    
}
