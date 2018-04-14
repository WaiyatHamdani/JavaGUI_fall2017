/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author 00220682
 */
public class JHoverButton extends JButton implements MouseListener {
    public JHoverButton(){
        super();
        initialize();
    }
    public JHoverButton(String text){
        super(text);
        initialize();
    }
    public JHoverButton(String text, Icon icon){
        super(text,icon);
        initialize();
    }
    private void initialize(){
        this.setBorderPainted(false);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(!isBorderPainted()&& isEnabled()){
            setBorderPainted(true);
            repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(isBorderPainted()){
            setBorderPainted(false);
            repaint();
        }
    }
    
    @Override
    public void setEnabled(boolean enabled){
        super.setEnabled(enabled);
        if(enabled){
            if(isBorderPainted()){
                setBorderPainted(false);
                repaint();
            }
        }
    }
}
