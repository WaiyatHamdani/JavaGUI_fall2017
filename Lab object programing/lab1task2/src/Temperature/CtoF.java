/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

/**
 *
 * @author waiya
 */
public class CtoF {
    private double degreec;
    
    public double getDegreeC(){
        return degreec;
    }
    public void getDegreeC(double degreec){
        this.degreec= degreec;
    }
     public CtoF(double degreec){
        this.degreec=degreec;
    }
     public double convertC(){
        return 9.0/5*(degreec+32);
     }
}
