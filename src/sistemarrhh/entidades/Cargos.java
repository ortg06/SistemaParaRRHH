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
public class Cargos {
    
    private int dpID;
    private String caNombre;

    public Cargos() {
    }

    public Cargos(int dpID, String caNombre) {
        this.dpID = dpID;
        this.caNombre = caNombre;
    }

    public int getDpID() {
        return dpID;
    }

    public void setDpID(int dpID) {
        this.dpID = dpID;
    }

    public String getCaNombre() {
        return caNombre;
    }

    public void setCaNombre(String caNombre) {
        this.caNombre = caNombre;
    }

    @Override
    public String toString() {
        return "Cargos{" + "dpID=" + dpID + ", caNombre=" + caNombre + '}';
    }
    
    
}
