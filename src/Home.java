
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hayat
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_AddOrder = new javax.swing.JButton();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jButton_AddOrder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 450));
        setSize(new java.awt.Dimension(750, 450));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(740, 450));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("Welcome");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("May 6, 2021");

        jButton_AddOrder.setBackground(new java.awt.Color(153, 204, 0));
        jButton_AddOrder.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_AddOrder.setForeground(new java.awt.Color(51, 51, 51));
        jButton_AddOrder.setText("Add Order");
        jButton_AddOrder.setBorder(null);
        jButton_AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddOrderActionPerformed(evt);
            }
        });

        jLabel_Close.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(153, 204, 0));
        jLabel_Close.setText("x");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Minimize.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(153, 204, 0));
        jLabel_Minimize.setText("_");
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jButton_AddOrder1.setBackground(new java.awt.Color(153, 204, 0));
        jButton_AddOrder1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton_AddOrder1.setForeground(new java.awt.Color(51, 51, 51));
        jButton_AddOrder1.setText("Manage Drivers");
        jButton_AddOrder1.setBorder(null);
        jButton_AddOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddOrder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton_AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_AddOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_Minimize)
                .addGap(26, 26, 26)
                .addComponent(jLabel_Close)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Minimize)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Close)))
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_AddOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(348, 348, 348))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddOrderActionPerformed
        createRoute crt = new createRoute();
        crt.setVisible(true);
        crt.setLocationRelativeTo(null);
        crt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_AddOrderActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        this.jLabel_Close.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
         this.jLabel_Close.setForeground(new Color(153, 204, 0));
    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        this.jLabel_Minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
        this.jLabel_Minimize.setForeground(new Color(153, 204, 0));
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jButton_AddOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddOrder1ActionPerformed
        AddDriver addDriver = new AddDriver();
        addDriver.setVisible(true);
        addDriver.setLocationRelativeTo(null);
        addDriver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_AddOrder1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddOrder;
    private javax.swing.JButton jButton_AddOrder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
