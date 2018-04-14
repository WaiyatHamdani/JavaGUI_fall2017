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
public class FtoC {
    private double degreef;
    
    public double getDegreeF(){
        return degreef;
    }
    public void getDegree(double degreef){
        this.degreef= degreef;
    }
    public FtoC(double degreef){
        this.degreef=degreef;
    }
    public double convertF(){
        return 5.0/9*(degreef-32);
    }
}
    