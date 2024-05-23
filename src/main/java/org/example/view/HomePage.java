/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.view;

import org.example.model.Pet;
import org.example.repository.AdminRepository;
import org.example.repository.PetRepository;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xyz6269
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        DashBoardButton = new javax.swing.JButton();
        RequestsPanel = new javax.swing.JButton();
        RequestsPanel2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SidePanel.setBackground(new java.awt.Color(22, 25, 29));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(173, 216, 230));
        HomeButton.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(173, 216, 230));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-24.png"))); // NOI18N
        SidePanel.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 52, 47));

        DashBoardButton.setBackground(new java.awt.Color(173, 216, 230));
        DashBoardButton.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        DashBoardButton.setForeground(new java.awt.Color(22, 25, 28));
        DashBoardButton.setText("Home");
        DashBoardButton.setPreferredSize(new java.awt.Dimension(102, 27));
        DashBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashBoardButtonActionPerformed(evt);
            }
        });
        SidePanel.add(DashBoardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 325, 66));

        RequestsPanel.setBackground(new java.awt.Color(173, 216, 230));
        RequestsPanel.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        RequestsPanel.setForeground(new java.awt.Color(22, 25, 28));
        RequestsPanel.setText("requests");
        RequestsPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestsPanelActionPerformed(evt);
            }
        });
        SidePanel.add(RequestsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 266, 325, 66));

        RequestsPanel2.setBackground(new java.awt.Color(173, 216, 230));
        RequestsPanel2.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        RequestsPanel2.setForeground(new java.awt.Color(22, 25, 28));
        RequestsPanel2.setText("manage pets");
        RequestsPanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestsPanel2ActionPerformed(evt);
            }
        });
        SidePanel.add(RequestsPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 325, 66));

        jPanel1.setBackground(new java.awt.Color(45, 50, 55));

        jLabel1.setFont(new java.awt.Font("JetBrainsMono NF", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 216, 230));

        jPanel2.setBackground(new java.awt.Color(45, 50, 55));
        jPanel2.setMaximumSize(new java.awt.Dimension(879, 698));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(879, 698));
        jPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DashBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashBoardButtonActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Our Pets :");
        JPanel homePanel = new Home();
        jPanel2.removeAll();
        jPanel2.add(homePanel, "home panel");
        ((CardLayout) jPanel2.getLayout()).show(jPanel2, "home panel");
    }//GEN-LAST:event_DashBoardButtonActionPerformed

    private void RequestsPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestsPanelActionPerformed
        // TODO add your handling code here:
        JPanel requestsPanel = new RequestsPage();
        jLabel1.setText("Adoption Requests :");
        jPanel2.removeAll();
        System.out.println(jPanel2.getWidth());
        System.out.println(jPanel2.getHeight());
        jPanel2.add(requestsPanel, "requests panel");
        ((CardLayout) jPanel2.getLayout()).show(jPanel2, "request panel");
    }//GEN-LAST:event_RequestsPanelActionPerformed

    private void RequestsPanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestsPanel2ActionPerformed
        // TODO add your handling code here:
        JPanel addPetForum = new AddPetForum();
        jLabel1.setText("add pet :");
        jPanel2.removeAll();
        System.out.println(jPanel2.getWidth());
        System.out.println(jPanel2.getHeight());
        jPanel2.add(addPetForum, "add pets panel");
        ((CardLayout) jPanel2.getLayout()).show(jPanel2, "request panel");
    }//GEN-LAST:event_RequestsPanel2ActionPerformed


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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DashBoardButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton RequestsPanel;
    private javax.swing.JButton RequestsPanel2;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
