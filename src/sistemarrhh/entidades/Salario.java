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
public class Salario {
    
    private int idSalarios;
    private double monto;
    private Date slFechaInicio;
    private Date slFechaFIN;
    private String usuarioModifica;
    private java.sql.Date fechaCreacion;
    private String usuarioCreacion;
    private java.sql.Date fechaModificacion;
    private int noEmpleado;

    public Salario() {
    }

    public Salario(int idSalarios, double monto, Date slFechaInicio, Date slFechaFIN, int noEmpleado) {
        this.idSalarios = idSalarios;
        this.monto = monto;
        this.slFechaInicio = slFechaInicio;
        this.slFechaFIN = slFechaFIN;
        this.noEmpleado = noEmpleado;
    }

    
    public Salario(int idSalarios, double monto, Date slFechaInicio, Date slFechaFIN, String usuarioModifica,
            java.sql.Date fechaCreacion,String usuarioCreacion, java.sql.Date fechaModificacion, int noEmpleado) {
        this.idSalarios = idSalarios;
        this.monto = monto;
        this.slFechaInicio = slFechaInicio;
        this.slFechaFIN = slFechaFIN;
        this.usuarioModifica = usuarioModifica;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.noEmpleado = noEmpleado;
    }

    public int getIdSalarios() {
        return idSalarios;
    }

    public void setIdSalarios(int idSalarios) {
        this.idSalarios = idSalarios;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getSlFechaInicio() {
        return slFechaInicio;
    }

    public void setSlFechaInicio(Date slFechaInicio) {
        this.slFechaInicio = slFechaInicio;
    }

    public Date getSlFechaFIN() {
        return slFechaFIN;
    }

    public void setSlFechaFIN(Date slFechaFIN) {
        this.slFechaFIN = slFechaFIN;
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

    public java.sql.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public java.sql.Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(java.sql.Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    @Override
    public String toString() {
        return "Salario{" + "idSalarios=" + idSalarios + ", monto=" + monto + ", slFechaInicio=" + slFechaInicio + ", slFechaFIN=" + slFechaFIN + ", noEmpleado=" + noEmpleado + '}';
    }
}
