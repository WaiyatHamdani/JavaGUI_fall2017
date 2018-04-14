/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.*;

/**
 *
 * @author tduffy
 */
public class HexColorLabel extends JLabel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        String red = Integer.toHexString(ce.getColor().getRed());
        if(red.length()<2)
            red = "0" + red;
        String green = Integer.toHexString(ce.getColor().getGreen());
        if(green.length()<2)
            green = "0" + green;
        String blue = Integer.toHexString(ce.getColor().getBlue());
        if(blue.length()<2)
            blue = "0" + blue;
        setText("Hex Color: #" + red + green + blue);
        //Tried this first - problem with leading 0s
        //setText("Hex Color: #" + Integer.toHexString(ce.getColor().getRed())+Integer.toHexString(ce.getColor().getGreen())+Integer.toHexString(ce.getColor().getBlue()));
    }
    
    public HexColorLabel(){
        super("Hex Color: #000000");
        //setText("Hex Color: #000000");
    }
    
}
