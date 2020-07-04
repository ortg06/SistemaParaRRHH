/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemarrhh.entidades.Cargo;

/**
 *
 * @author ortg_
 */
public class CargoDao extends AbstractDao<Cargo>{

    @Override
    protected Cargo getMappingResults(ResultSet rs) throws SQLException {
        return new Cargo(rs.getInt("CA_ID"),
                rs.getString("CA_NOMBRE"),
                rs.getInt("DP_ID")
          );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Cargo entity) throws SQLException {
            ps.setInt(1, entity.getCaID());
            ps.setString(2, entity.getCaNombre());
            ps.setInt(3, entity.getDpID());
    }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Cargo entity) throws SQLException {
            ps.setInt(1, entity.getCaID());
            ps.setString(2, entity.getCaNombre());
            ps.setInt(3, entity.getDpID());
            ps.setInt(4, entity.getCaID());
    }

    @Override
    protected String getTableName() {
        return "GE_CA_CARGO";
    }

    @Override
    protected String[] getTableColumns() {
         String[] str = {
             "CA_ID",
             "CA_NOMBRE",
             "DP_ID",
            };
        return str;
    }

    @Override
    protected String getTableKey() {
        return "CA_ID";
    }

    @Override
    protected String getSchema() {
        return "BDRRHH";
    }
    
}
