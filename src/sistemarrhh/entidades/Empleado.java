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
public class Empleado {

    private int noEmpleado;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaContrato;
    private String usuarioModifica;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private int dpID;
    private int superior;
    private int tpID;
    private int stId;

    public Empleado() {
    }

    public Empleado(int noEmpleado, String nombre, String apellido, Date fechaNacimiento, Date fechaContrato, int dpID, int superior, int tpID, int stId) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
        this.dpID = dpID;
        this.superior = superior;
        this.tpID = tpID;
        this.stId = stId;
    }

    public Empleado(int noEmpleado, String nombre, String apellido, Date fechaNacimiento, Date fechaContrato, String usuarioModifica, String usuarioCreacion, Date fechaCreacion, Date fechaModificacion, int dpID, int superior, int tpID, int stId) {
        this.noEmpleado = noEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
        this.usuarioModifica = usuarioModifica;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.dpID = dpID;
        this.superior = superior;
        this.tpID = tpID;
        this.stId = stId;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
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

    public int getDpID() {
        return dpID;
    }

    public void setDpID(int dpID) {
        this.dpID = dpID;
    }

    public int getSuperior() {
        return superior;
    }

    public void setSuperior(int superior) {
        this.superior = superior;
    }

    public int getTpID() {
        return tpID;
    }

    public void setTpID(int tpID) {
        this.tpID = tpID;
    }

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    @Override
    public String toString() {
        return "Empleado{" + "noEmpleado=" + noEmpleado + ", nombre=" + nombre 
                + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento 
                + ", fechaContrato=" + fechaContrato + ", dpID=" + dpID + ", superior=" 
                + superior + ", tpID=" + tpID + ", stId=" + stId + '}';
    }

}
