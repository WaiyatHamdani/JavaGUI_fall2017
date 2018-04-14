/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempConverter;

/**
 *
 * @author 01659956
 */
public class CtoF {
    private double degree;

    public double getDegree() {
        return degree;
    }

    public void setDegreec(double degree) {
        this.degree = degree;
    }

    public CtoF(double degreec) {
        this.degree = degree;
    }
    public double convertC(){
        return 9.0/5*(degree+32);
                 
    }
}
