/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintForRoom;

import javax.swing.JOptionPane;

/**
 *
 * @author waiya
 */
public class PainCalculator extends javax.swing.JFrame {

    /**
     * Creates new form PainCalculator
     */
    public PainCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtWidthRoom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLengthRoom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHeightRoom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumWindow = new javax.swing.JTextField();
        txtNumDoor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btCalc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint calculator");

        jLabel1.setText("Width of the Room");

        txtWidthRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthRoomActionPerformed(evt);
            }
        });

        jLabel2.setText("Length of the Room");

        txtLengthRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthRoomActionPerformed(evt);
            }
        });

        jLabel3.setText("Height of the Room");

        jLabel4.setText("Number of Windows");

        jLabel5.setText("Number of Door");

        txtNumDoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDoorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtHeightRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWidthRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLengthRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtNumDoor))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtWidthRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLengthRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumDoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHeightRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btCalc.setText("Calculate");
        btCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcActionPerformed(evt);
            }
        });
        jPanel2.add(btCalc);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWidthRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWidthRoomActionPerformed

    private void txtLengthRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthRoomActionPerformed

    private void btCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcActionPerformed
        // TODO add your handling code here:
        try{
        double height = Double.parseDouble(txtHeightRoom.getText());
        double width = Double.parseDouble(txtWidthRoom.getText());
        double length = Double.parseDouble(txtLengthRoom.getText());
        double Amountdoor = Double.parseDouble(txtNumDoor.getText());
        double Amountwindow = Double.parseDouble(txtNumWindow.getText());
        
        GallonForRoom gallonforroom = new GallonForRoom (height,width,length,Amountdoor,Amountwindow);
        StringBuilder results= new StringBuilder(txtResult.getText());
        results.append("\nthe height of the room: ");
        results.append(height);
        results.append("\nthe width of the room: ");
        results.append (width);
        results.append ("\nThe length of the room: ");
        results.append (length);
        results.append ("\n Amount of windows: ");
        results.append(Amountwindow);
        results.append ("\n Amount of doors: ");
        results.append(Amountdoor);
        results.append ("\nvolume of the room: ");
        results.append (gallonforroom.getRoomVolume());
        results.append ("\n Total Gallon of paint being used: ");
        results.append (gallonforroom.getGallonPerRoom());
        txtResult.setText(results.toString());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "An error");
        }
    }//GEN-LAST:event_btCalcActionPerformed

    private void txtNumDoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDoorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDoorActionPerformed

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
            java.util.logging.Logger.getLogger(PainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHeightRoom;
    private javax.swing.JTextField txtLengthRoom;
    private javax.swing.JTextField txtNumDoor;
    private javax.swing.JTextField txtNumWindow;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtWidthRoom;
    // End of variables declaration//GEN-END:variables
}