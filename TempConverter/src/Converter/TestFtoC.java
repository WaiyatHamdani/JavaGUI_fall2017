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
public class TestFtoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FtoC ftoc=new FtoC(32);
        System.out.println("degree:"+ftoc.getDegree());
        ftoc.getDegree(212);
        System.out.println("degree:"+ftoc.getDegree());
        System.out.println("degree Celcius:"+ftoc.convert());
    }
    
}
