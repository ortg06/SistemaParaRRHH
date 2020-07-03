/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarrhh.entidades;

/**
 *
 * @author ortg_
 */
public class TipoEmpleo {
    
    private int tpID;
    private String tpNombre;
    private String tpDescripcion;

    public TipoEmpleo() {
    }

    public TipoEmpleo(int tpID, String tpNombre, String tpDescripcion) {
        this.tpID = tpID;
        this.tpNombre = tpNombre;
        this.tpDescripcion = tpDescripcion;
    }

    public int getTpID() {
        return tpID;
    }

    public void setTpID(int tpID) {
        this.tpID = tpID;
    }

    public String getTpNombre() {
        return tpNombre;
    }

    public void setTpNombre(String tpNombre) {
        this.tpNombre = tpNombre;
    }

    public String getTpDescripcion() {
        return tpDescripcion;
    }

    public void setTpDescripcion(String tpDescripcion) {
        this.tpDescripcion = tpDescripcion;
    }

    @Override
    public String toString() {
        return "TipoEmpleo{" + "tpID=" + tpID + ", tpNombre=" + tpNombre + ", tpDescripcion=" + tpDescripcion + '}';
    }
    
    
}
