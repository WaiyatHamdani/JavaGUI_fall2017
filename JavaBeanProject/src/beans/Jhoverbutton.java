/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
/**
 *
 * @author 01659956
 */
public class Jhoverbutton extends JButton implements MouseListener {
    public Jhoverbutton(){
        super();
        initialize();
        
    }
    private void initialize(){
        this.setBorderPainted(false);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(isBorderPainted()&& isEnabled()){
            setBorderPainted(true);
            repaint();
            
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
       if(isBorderPainted());
       setBorderPainted(false);
            repaint();
        }

    }
   

