/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp3_interface;

import javax.swing.JOptionPane;

/**
 *
 * @author bcrep
 */
public class Interface_1 extends javax.swing.JFrame {

    /**
     * Creates new form Interface_1
     */
    public Interface_1() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonDiminuir = new javax.swing.JButton();
        jButtonZerar = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafio 1 - Bruno Crepaldi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desafio 1");

        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNumero.setText("0");
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jButtonDiminuir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDiminuir.setText("Diminuir");
        jButtonDiminuir.setPreferredSize(new java.awt.Dimension(105, 31));
        jButtonDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiminuirActionPerformed(evt);
            }
        });

        jButtonZerar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonZerar.setText("Zerar");
        jButtonZerar.setPreferredSize(new java.awt.Dimension(105, 31));
        jButtonZerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZerarActionPerformed(evt);
            }
        });

        jButtonSomar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSomar.setText("Somar");
        jButtonSomar.setPreferredSize(new java.awt.Dimension(105, 31));
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldNumero)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonZerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jButtonDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiminuirActionPerformed
        try {
            Double num = Double.parseDouble(jTextFieldNumero.getText().replaceAll(",", "."));

            if (num != null) {
                jTextFieldNumero.setText(String.valueOf(num - 1));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "É permitido apenas numeros");
        }
    }//GEN-LAST:event_jButtonDiminuirActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        try {
            Double num = Double.parseDouble(jTextFieldNumero.getText().replaceAll(",", "."));
            if (num != null) {
                jTextFieldNumero.setText(String.valueOf(num + 1));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "É permitido apenas numeros");
        }
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonZerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZerarActionPerformed
        try {
            Double num = Double.parseDouble(jTextFieldNumero.getText().replaceAll(",", "."));
            if (num != null) {
                jTextFieldNumero.setText(String.valueOf(num = 0.0));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "É permitido apenas numeros");
        }
    }//GEN-LAST:event_jButtonZerarActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDiminuir;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonZerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
