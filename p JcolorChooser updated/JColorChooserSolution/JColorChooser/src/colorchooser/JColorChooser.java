/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author 00220682
 */
public class JColorChooser extends javax.swing.JDialog implements ColorListener, ActionListener{
    
    private Color color = Color.BLACK;
    private JComponent component;

    /**
     * Creates new form JColorChooser
     */
    public JColorChooser() {
        initComponents();
        chooser.addColorListener(values);
        chooser.addColorListener(canvas);
        chooser.addColorListener(lblHex);
        chooser.addColorListener(this);
        values.addColorListener(chooser);
        values.addColorListener(canvas);
        values.addColorListener(lblHex);
        values.addColorListener(this);
        btnDone.addActionListener(this);
    }
    
    public void addColorListener(ColorListener colorListener){
        //delegate to chooser and values panel
        //called for outside components
        chooser.addColorListener(colorListener);
        values.addColorListener(colorListener);
    }
    
    public void removeColorListener(ColorListener colorListener){
        //delegate to chooser and values panel
        //called for outside components
        chooser.removeColorListener(colorListener);
        values.removeColorListener(colorListener);
    }
    
    public JColorChooser(Color color){
        this();
        this.color = color;
        chooser.fireColorEvent();
        values.fireColorEvent();
    }
    
    public JColorChooser(JComponent component){
        this();
        this.component = component;
        this.color = new Color(component.getForeground().getRed(),component.getForeground().getGreen(),component.getForeground().getBlue());
        chooser.fireColorEvent();
        values.fireColorEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new colorchooser.ColorPanel();
        chooser = new colorchooser.ColorChooser();
        values = new colorchooser.ColorValuesPanel();
        jPanel1 = new javax.swing.JPanel();
        lblHex = new colorchooser.HexColorLabel();
        btnDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JColorChooser");

        canvas.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(canvas, java.awt.BorderLayout.NORTH);
        getContentPane().add(chooser, java.awt.BorderLayout.CENTER);
        getContentPane().add(values, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jPanel1.add(lblHex);

        btnDone.setText("Done");
        jPanel1.add(btnDone);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(381, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColorChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private colorchooser.ColorPanel canvas;
    private colorchooser.ColorChooser chooser;
    private javax.swing.JPanel jPanel1;
    private colorchooser.HexColorLabel lblHex;
    private colorchooser.ColorValuesPanel values;
    // End of variables declaration//GEN-END:variables

    @Override
    public void changeColor(ColorEvent ce) {
        this.color = ce.getColor();
        if(component != null)
            this.component.setForeground(ce.getColor());
    }
    
    public Color getColor(){
        return color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}