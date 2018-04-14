/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 01659956
 */
public class AnimalListCelRenderer extends DefaultListCellRenderer{
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
        // Animal animal= (Animal)value;
         setIcon(new ImageIcon(this.getClass().getResource("images/"+value+".jpg")));
         setText(value.toString());
         return this;
                 
    }
    
}

    
  

