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
public class EstatusEmpleado {
    
    private int stID;
    private String stNombre;

    public EstatusEmpleado() {
    }

    public EstatusEmpleado(int stID, String stNombre) {
        this.stID = stID;
        this.stNombre = stNombre;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getStNombre() {
        return stNombre;
    }

    public void setStNombre(String stNombre) {
        this.stNombre = stNombre;
    }

    @Override
    public String toString() {
        return "EstatusEmpleado{" + "stID=" + stID + ", stNombre=" + stNombre + '}';
    }
    
    
    
}
