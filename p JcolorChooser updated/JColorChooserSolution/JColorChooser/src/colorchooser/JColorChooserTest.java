/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tduffy
 */
public class JColorChooserTest extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form JColorChooserTest
     */
    public JColorChooserTest() {
        initComponents();
        btnDefault.addActionListener(this);
        btnCustom.addActionListener(this);
        btnPlain.addActionListener(this);
        btnModal.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDefault = new javax.swing.JButton();
        lblDefault = new colorchooser.ColorLabel();
        btnCustom = new javax.swing.JButton();
        lblCustom = new colorchooser.ColorLabel();
        btnPlain = new javax.swing.JButton();
        lblPlain = new javax.swing.JLabel();
        btnModal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2, 10, 0));

        btnDefault.setText("Show Default Chooser");
        getContentPane().add(btnDefault);
        getContentPane().add(lblDefault);

        btnCustom.setText("Show Custom Chooser");
        getContentPane().add(btnCustom);
        getContentPane().add(lblCustom);

        btnPlain.setText("Non-ColorListener");
        getContentPane().add(btnPlain);

        lblPlain.setText("Plain JLabel");
        getContentPane().add(lblPlain);

        btnModal.setText("Modal Test");
        getContentPane().add(btnModal);

        setSize(new java.awt.Dimension(382, 176));
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
            java.util.logging.Logger.getLogger(JColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColorChooserTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColorChooserTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustom;
    private javax.swing.JButton btnDefault;
    private javax.swing.JButton btnModal;
    private javax.swing.JButton btnPlain;
    private colorchooser.ColorLabel lblCustom;
    private colorchooser.ColorLabel lblDefault;
    private javax.swing.JLabel lblPlain;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==btnDefault){
            JColorChooser chooser = new JColorChooser();
            chooser.addColorListener(lblDefault);
            chooser.setVisible(true);
        }else if(source==btnCustom){
            JColorChooser chooser = new JColorChooser(lblCustom.getForeground());
            chooser.addColorListener(lblCustom);
            chooser.setVisible(true);
        }else if(source==btnPlain){
            JColorChooser chooser = new JColorChooser(lblPlain);
            chooser.setVisible(true);
        }else if(source==btnModal){
            new JColorChooserTest2().setVisible(true);
        }
    }
}
