/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author 01659956
 */
public class FtoC {
    private double degree;
    
    public double getDegree(){
        return degree;
    }
    public void getDegree(double degree){
        this.degree= degree;
    }
    public FtoC(double degree){
        this.degree=degree;
    }
    public double convert(){
        return 5.0/9*(degree-32);
    }
}
    
    
