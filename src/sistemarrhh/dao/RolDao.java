/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemarrhh.entidades.Rol;

/**
 *
 * @author ortg_
 */
public class RolDao extends AbstractDao<Rol> {

    @Override
    protected Rol getMappingResults(ResultSet rs) throws SQLException {
        return new Rol(
                rs.getInt("ROL_ID"),
                rs.getString("ROL_NOMBRE")
        );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Rol entity) throws SQLException {
        ps.setInt(1, entity.getRolID());
        ps.setString(2, entity.getRolNombre());

    }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Rol entity) throws SQLException {
        ps.setInt(1, entity.getRolID());
        ps.setString(2, entity.getRolNombre());
        ps.setInt(3, entity.getRolID());
    }

    @Override
    protected String getTableName() {
        return "GE_RO_ROL";
    }

    @Override
    protected String[] getTableColumns() {
        String[] str = {
            "ROL_ID",
            "ROL_NOMBRE"
        };
        return str;
    }

    @Override
    protected String getTableKey() {
        return "ROL_ID";
    }

    @Override
    protected String getSchema() {
        return "BDRRHH";
    }

}
