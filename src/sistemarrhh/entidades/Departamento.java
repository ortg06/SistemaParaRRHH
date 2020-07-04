/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.entidades;

import java.sql.Date;

/**
 *
 * @author ortg_
 */
public class Departamento {
    
    private int dpID;
    private String dpNombre;
    private String usuarioModifica;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public Departamento() {
    }

    public Departamento(int dpID, String dpNombre) {
        this.dpID = dpID;
        this.dpNombre = dpNombre;
    }

    public Departamento(int dpID, String dpNombre, String usuarioModifica, String usuarioCreacion, Date fechaCreacion, Date fechaModificacion) {
        this.dpID = dpID;
        this.dpNombre = dpNombre;
        this.usuarioModifica = usuarioModifica;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

   

    public int getDpID() {
        return dpID;
    }

    public void setDpID(int dpID) {
        this.dpID = dpID;
    }

    public String getDpNombre() {
        return dpNombre;
    }

    public void setDpNombre(String dpNombre) {
        this.dpNombre = dpNombre;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    
    
}
