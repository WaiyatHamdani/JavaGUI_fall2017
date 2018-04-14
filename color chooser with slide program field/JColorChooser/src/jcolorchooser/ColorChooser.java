/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolorchooser;
import java.util.Vector;
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author 00220682
 */
public class ColorChooser extends javax.swing.JPanel implements ChangeListener{
    
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

        jLabel1 = new javax.swing.JLabel();
        sldRed = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldGreen = new javax.swing.JSlider();
        sldBlue = new javax.swing.JSlider();

        jLabel1.setText("Red");

        sldRed.setMajorTickSpacing(50);
        sldRed.setMaximum(255);
        sldRed.setMinorTickSpacing(10);
        sldRed.setPaintLabels(true);
        sldRed.setPaintTicks(true);
        sldRed.setValue(0);

        jLabel2.setText("Green");

        jLabel3.setText("Blue");

        sldGreen.setMajorTickSpacing(50);
        sldGreen.setMaximum(255);
        sldGreen.setMinorTickSpacing(10);
        sldGreen.setPaintLabels(true);
        sldGreen.setPaintTicks(true);
        sldGreen.setValue(0);

        sldBlue.setMajorTickSpacing(50);
        sldBlue.setMaximum(255);
        sldBlue.setMinorTickSpacing(10);
        sldBlue.setPaintLabels(true);
        sldBlue.setPaintTicks(true);
        sldBlue.setValue(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sldRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(sldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent ce) {
        int r = sldRed.getValue();
        int g = sldGreen.getValue();
        int b = sldBlue.getValue();
        Color color = new Color(r,g,b);
        fireColorEvent(new ColorEvent(this,color));
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
    public void addColorListener(ColorListener colorListener){
        listeners.addElement(colorListener);
    }
    public void removeColorListener(ColorListener colorListener){
        listeners.removeElement(colorListener);
    }
}
