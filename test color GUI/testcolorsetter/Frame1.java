/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcolorsetter;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import jcolorchooser.ColorEvent;
import jcolorchooser.ColorListener;

/**
 *
 * @author dpershyn
 */
public class Frame1 extends javax.swing.JFrame implements ColorListener {
    
Frame2 frame2 = new Frame2();




/*    
    public static JComponent changeColor;
    
    static JComponent getJcomponent (){
        
        return changeColor;
    }
    
    public Frame1 (JComponent jComponent){
        this.changeColor = jComponent;
    }
    
*/
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
//        getContentPane().setBackground(Color.yellow);
       
//        panelColor1.addCol
        
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelColor1 = new testcolorsetter.PanelColor();
        setColorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setColorBtn.setText("SET COLOR");
        setColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelColor1Layout = new javax.swing.GroupLayout(panelColor1);
        panelColor1.setLayout(panelColor1Layout);
        panelColor1Layout.setHorizontalGroup(
            panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(setColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        panelColor1Layout.setVerticalGroup(
            panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(setColorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColorBtnActionPerformed
        // TODO add your handling code here:
        //panelColor1.setBackground(Color.red);
        //chooser.
//        frame2 =  new Frame2();
        frame2.setVisible(true);
        
        
        
    }//GEN-LAST:event_setColorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Frame1 frame = new Frame1();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
//                frame.setTitle("");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private testcolorsetter.PanelColor panelColor1;
    private javax.swing.JButton setColorBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void changeColor(ColorEvent ce) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

 setBackground(ce.getColor());
 repaint();

    }
    
  public JPanel getMyPanel (){
      return panelColor1;
  }
    
}