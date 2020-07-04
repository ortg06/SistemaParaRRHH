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
public class Cargo {
    
    private int caID;
    private String caNombre;
    private int dpID;

    public Cargo() {
    }

    public Cargo(int caID, String caNombre, int dpID) {
        this.caID = caID;
        this.caNombre = caNombre;
        this.dpID = dpID;
    }

    public int getCaID() {
        return caID;
    }

    public void setCaID(int caID) {
        this.caID = caID;
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
        return "Cargo{" + "caID=" + caID + ", dpID=" + dpID + ", caNombre=" + caNombre + '}';
    }
}
