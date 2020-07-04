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
public class Usuario {
    
    private int usID;
    private String usNombre;
    private int rolID;
    private String usCorreo;
    private String usContraseña;

    public Usuario() {
    }

    public Usuario(int usID, String usNombre, int rolID, String usCorreo,String usContraseña) {
        this.usID = usID;
        this.usNombre = usNombre;
        this.rolID = rolID;
        this.usCorreo = usCorreo;
       this.usContraseña = usContraseña;
    }

    public int getUsID() {
        return usID;
    }

    public void setUsID(int usID) {
        this.usID = usID;
    }

    public String getUsNombre() {
        return usNombre;
    }

    public void setUsNombre(String usNombre) {
        this.usNombre = usNombre;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    public String getUsCorreo() {
        return usCorreo;
    }

    public void setUsCorreo(String usCorreo) {
        this.usCorreo = usCorreo;
    }

    public String getUsContraseña() {
        return usContraseña;
    }

    public void setUsContraseña(String usContraseña) {
        this.usContraseña = usContraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usID=" + usID + ", usNombre=" + usNombre + ", rolID=" + rolID + ", usCorreo=" + usCorreo + '}';
    }

}
