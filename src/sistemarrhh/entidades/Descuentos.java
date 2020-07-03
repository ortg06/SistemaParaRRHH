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
public class Descuentos {
    
    
    private int dsId;
    private String dsNombre;

    public Descuentos() {
    }

    public Descuentos(int dsId, String dsNombre) {
        this.dsId = dsId;
        this.dsNombre = dsNombre;
    }

    public int getDsId() {
        return dsId;
    }

    public void setDsId(int dsId) {
        this.dsId = dsId;
    }

    public String getDsNombre() {
        return dsNombre;
    }

    public void setDsNombre(String dsNombre) {
        this.dsNombre = dsNombre;
    }

    @Override
    public String toString() {
        return "Descuentos{" + "dsId=" + dsId + ", dsNombre=" + dsNombre + '}';
    }
    
    
}
