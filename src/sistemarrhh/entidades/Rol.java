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
public class Rol {
    
    private int rolID;
    private String rolNombre;

    public Rol() {
    }

    
    public Rol(int rolID, String rolNombre) {
        this.rolID = rolID;
        this.rolNombre = rolNombre;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    @Override
    public String toString() {
        return "Rol{" + "rolID=" + rolID + ", rolNombre=" + rolNombre + '}';
    }
}
