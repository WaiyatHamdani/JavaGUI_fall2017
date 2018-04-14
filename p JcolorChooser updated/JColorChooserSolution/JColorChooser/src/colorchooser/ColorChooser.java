/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;
import javax.swing.event.*;
import java.awt.Color;
import java.util.Vector;
import javax.swing.SwingUtilities;

/**
 *
 * @author 00220682
 */
public class ColorChooser extends javax.swing.JPanel implements ChangeListener, ColorListener{
    
    private Vector listeners;

    /**
     * Creates new form ColorChooser
     */
    public ColorChooser() {
        initComponents();
        listeners = new Vector();
        sldRed.addChangeListener(this);
        sldGreen.addChangeListener(this);
        sldBlue.addChangeListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sldRed = new javax.swing.JSlider();
        sldGreen = new javax.swing.JSlider();
        sldBlue = new javax.swing.JSlider();

        setLayout(new java.awt.GridLayout(3, 1));

        sldRed.setMajorTickSpacing(50);
        sldRed.setMaximum(255);
        sldRed.setMinorTickSpacing(10);
        sldRed.setPaintLabels(true);
        sldRed.setPaintTicks(true);
        sldRed.setValue(0);
        add(sldRed);

        sldGreen.setMajorTickSpacing(50);
        sldGreen.setMaximum(255);
        sldGreen.setMinorTickSpacing(10);
        sldGreen.setPaintLabels(true);
        sldGreen.setPaintTicks(true);
        sldGreen.setValue(0);
        add(sldGreen);

        sldBlue.setMajorTickSpacing(50);
        sldBlue.setMaximum(255);
        sldBlue.setMinorTickSpacing(10);
        sldBlue.setPaintLabels(true);
        sldBlue.setPaintTicks(true);
        sldBlue.setValue(0);
        add(sldBlue);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        /*
        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();
        Color color = new Color(r,g,b);
        fireColorEvent(new ColorEvent(this,color));
        */
        fireColorEvent();
    }
    
    private void fireColorEvent(ColorEvent colorEvent){
        Vector v;
        synchronized(this){
            v = (Vector)listeners.clone();
        }
        int size = v.size();
        for(int i=0; i<size; i++){
            ColorListener colorListener = (ColorListener)v.elementAt(i);
            colorListener.changeColor(colorEvent);
        }
    }
    public void fireColorEvent(){
        /*
        SwingUtilities.invokeLater Causes Runnable.run() to be executed 
        asynchronously on the AWT event dispatching thread. This will happen 
        after all pending AWT events have been processed. This method should be 
        used when an application thread needs to update the GUI.
        In this application, it ensures that one ColorEvent is processed at a 
        time.
        */
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                fireColorEvent(new ColorEvent(this,new Color(sldRed.getValue(),sldGreen.getValue(),sldBlue.getValue())));
            }
            
        });
        
    }
    public void addColorListener(ColorListener colorListener){
        listeners.addElement(colorListener);
    }
    public void removeColorListener(ColorListener colorListener){
        listeners.removeElement(colorListener);
    }

    @Override
    public void changeColor(ColorEvent ce) {
        sldRed.setValue(ce.getColor().getRed());
        sldGreen.setValue(ce.getColor().getGreen());
        sldBlue.setValue(ce.getColor().getBlue());
    }
}
