/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author tduffy
 */
public class ColorValuesPanel extends javax.swing.JPanel implements ColorListener, ActionListener, KeyListener, DocumentListener {
    
    private Vector listeners;
    int continueShowingErrors = 0;

    /**
     * Creates new form ColorValuesPanel
     */
    public ColorValuesPanel() {
        initComponents();
        listeners = new Vector();
        txtRed.addActionListener(this);
        txtGreen.addActionListener(this);
        txtBlue.addActionListener(this);
        txtRed.addKeyListener(this);
        txtGreen.addKeyListener(this);
        txtBlue.addKeyListener(this);
        txtRed.getDocument().addDocumentListener(this);
        txtGreen.getDocument().addDocumentListener(this);
        txtBlue.getDocument().addDocumentListener(this);
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
        txtRed = new colorchooser.JColorComponentTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGreen = new colorchooser.JColorComponentTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBlue = new colorchooser.JColorComponentTextField();

        setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setText("Red");
        add(jLabel1);

        txtRed.setText("0");
        add(txtRed);

        jLabel2.setText("Green");
        add(jLabel2);

        txtGreen.setText("0");
        add(txtGreen);

        jLabel3.setText("Blue");
        add(jLabel3);

        txtBlue.setText("0");
        add(txtBlue);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private colorchooser.JColorComponentTextField txtBlue;
    private colorchooser.JColorComponentTextField txtGreen;
    private colorchooser.JColorComponentTextField txtRed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void changeColor(ColorEvent ce) {
        txtRed.setText(ce.getColor().getRed()+"");
        txtGreen.setText(ce.getColor().getGreen()+"");
        txtBlue.setText(ce.getColor().getBlue()+"");
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
                try{
                    fireColorEvent(new ColorEvent(this,new Color(txtRed.getValue(),txtGreen.getValue(),txtBlue.getValue())));
                }catch(Exception e){
                    if(continueShowingErrors == 0){
                        continueShowingErrors = JOptionPane.showConfirmDialog(
                            null,
                            "One or more color values is invalid.\nContinue showing errors?",
                            "An Exception Occurred",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE
                            );
                    }
                }
            }
        });
    }
    public void addColorListener(ColorListener colorListener){
        listeners.addElement(colorListener);
    }
    public void removeColorListener(ColorListener colorListener){
        listeners.removeElement(colorListener);
    }
    //ActionListener method
    @Override
    public void actionPerformed(ActionEvent e) {
        //added this for convenience - forces users to press Enter
        fireColorEvent();
    }
    //KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*
        Tried this first - doesn't handle drag and drop or paste events
        fireColorEvent();
        */
    }
    //DocumentListener methods
    @Override
    public void insertUpdate(DocumentEvent e) {
        fireColorEvent();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        fireColorEvent();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        //Plain Text Documents don't fire this event
    }
}
