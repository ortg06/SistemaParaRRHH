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
public class Planilla {

    private int plID;
    private double plDescuentoISSS;
    private double plDescuentoAFP;
    private double plDescuentoRENTA;

    public Planilla() {
    }

    public Planilla(int plID, double plDescuentoISSS, double plDescuentoAFP, double plDescuentoRENTA) {
        this.plID = plID;
        this.plDescuentoISSS = plDescuentoISSS;
        this.plDescuentoAFP = plDescuentoAFP;
        this.plDescuentoRENTA = plDescuentoRENTA;
    }

    public int getPlID() {
        return plID;
    }

    public void setPlID(int plID) {
        this.plID = plID;
    }

    public double getPlDescuentoISSS() {
        return plDescuentoISSS;
    }

    public void setPlDescuentoISSS(double plDescuentoISSS) {
        this.plDescuentoISSS = plDescuentoISSS;
    }

    public double getPlDescuentoAFP() {
        return plDescuentoAFP;
    }

    public void setPlDescuentoAFP(double plDescuentoAFP) {
        this.plDescuentoAFP = plDescuentoAFP;
    }

    public double getPlDescuentoRENTA() {
        return plDescuentoRENTA;
    }

    public void setPlDescuentoRENTA(double plDescuentoRENTA) {
        this.plDescuentoRENTA = plDescuentoRENTA;
    }

    @Override
    public String toString() {
        return "Planilla{" + "plID=" + plID + ", plDescuentoISSS=" + plDescuentoISSS + ", plDescuentoAFP=" + plDescuentoAFP + ", plDescuentoRENTA=" + plDescuentoRENTA + '}';
    }
    
    
}
