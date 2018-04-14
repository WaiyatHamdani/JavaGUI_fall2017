/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcolorsetter;

import javax.swing.JPanel;
import jcolorchooser.ColorEvent;
import jcolorchooser.ColorListener;

/**
 *
 * @author dpershyn
 */
public class PanelColor extends JPanel implements ColorListener {

     public PanelColor (){
        super();
        setBackground(java.awt.Color.GRAY);
    }

    @Override
    public void changeColor(ColorEvent ce) {
        setBackground(ce.getColor());
    }
    
}