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
public class Departamento {
    
    private int dpID;
    private String dpNombre;

    public Departamento() {
    }

    public Departamento(int dpID, String dpNombre) {
        this.dpID = dpID;
        this.dpNombre = dpNombre;
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
    
    
    
}
