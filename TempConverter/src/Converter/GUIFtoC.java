/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import javax.swing.JOptionPane;

/**
 *
 * @author 01659956
 */
public class GUIFtoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String more="y";
        while(more.equalsIgnoreCase("y")){
            double degree=Double.parseDouble(JOptionPane.showInputDialog("Enter Degree in Fahrenheit:"));
           FtoC ftoc =new FtoC(degree);//input
           JOptionPane.showMessageDialog(null,ftoc.getDegree()+"f equals:"+ftoc.convert());
           more=JOptionPane.showInputDialog("want to repeat this:");
           
        }
    }
    
}
