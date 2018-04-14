/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolorchooser;

import javax.swing.JLabel;
/**
 *
 * @author 00220682
 */
public class ColorLabel extends JLabel implements ColorListener{

    @Override
    public void changeColor(ColorEvent ce) {
        //setText("Red: " + ce.getColor().getRed() + " Green: " + ce.getColor().getGreen() + " Blue: " + ce.getColor().getBlue());
        int r  = ce.getColor().getRed();
        int g = ce.getColor().getGreen();
        int b = ce.getColor().getBlue();
        String hex = String.format("#%02x%02x%02x",r,g,b);
        setText("Hex: " + hex);
        
    }
    
    public ColorLabel(){
        super();
        setText("Hex: #000000");
    }
    
}
