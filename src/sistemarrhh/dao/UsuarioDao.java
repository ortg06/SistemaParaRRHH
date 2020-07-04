/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemarrhh.entidades.Usuario;

/**
 *
 * @author ortg_
 */
public class UsuarioDao extends AbstractDao<Usuario>{

    @Override
    protected Usuario getMappingResults(ResultSet rs) throws SQLException {
       return new Usuario(
               rs.getInt("US_ID"),
               rs.getString("US_NOMBRE"),
               rs.getInt("ROL_ID"),
               rs.getString("US_CORREO"),
               rs.getString("US_CONTRASEÑA")
          );
    }

    @Override
    protected void setMappingParamsToInsert(PreparedStatement ps, Usuario entity) throws SQLException {
            ps.setInt(1, entity.getUsID());
            ps.setString(2, entity.getUsNombre());
            ps.setInt(3, entity.getRolID());
            ps.setString(4, entity.getUsCorreo());
            ps.setString(5, entity.getUsContraseña());
    }

    @Override
    protected void setMappingParamsToUpdate(PreparedStatement ps, Usuario entity) throws SQLException {
            ps.setInt(1, entity.getUsID());
            ps.setString(2, entity.getUsNombre());
            ps.setInt(3, entity.getRolID());
            ps.setString(4, entity.getUsCorreo());
            ps.setString(5, entity.getUsContraseña());
            ps.setInt(6, entity.getUsID());
    }

    @Override
    protected String getTableName() {
        return "GE_US_USUARIO";
    }

    @Override
    protected String[] getTableColumns() {
        String[] str = {
             "US_ID",
             "US_NOMBRE",
             "ROL_ID",
             "US_CORREO",
             "US_CONTRASEÑA"   
            };
        return str;
    }

    @Override
    protected String getTableKey() {
       return "US_ID";
    }

    @Override
    protected String getSchema() {
       return "BDRRHH";
    }
    
}
