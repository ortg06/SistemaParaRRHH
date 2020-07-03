/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.entidades;

import java.util.Date;

/**
 *
 * @author ortg_
 */
public class Salario {
    
    private int idSalarios;
    private double monto;
    private Date slFechaInicio;
    private Date slFechaFIN;

    public Salario() {
    }

    public Salario(int idSalarios, double monto, Date slFechaInicio, Date slFechaFIN) {
        this.idSalarios = idSalarios;
        this.monto = monto;
        this.slFechaInicio = slFechaInicio;
        this.slFechaFIN = slFechaFIN;
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

    @Override
    public String toString() {
        return "Salario{" + "idSalarios=" + idSalarios + ", salario=" + monto + ", slFechaInicio=" + slFechaInicio + ", slFechaFIN=" + slFechaFIN + '}';
    }
    
    
}
