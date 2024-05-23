/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import org.example.model.Request;
import org.example.repository.PetRepository;
import org.example.repository.RequestRepository;

import javax.swing.*;

/**
 *
 * @author xyz6269
 */
public class PetItem extends javax.swing.JPanel {

    /**
     * Creates new form PetItem
     */
    public PetItem() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        petRepository = new PetRepository();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(240, 365));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 25, 28));
        jPanel1.setPreferredSize(new java.awt.Dimension(230, 218));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(22, 25, 28));
        jLabel2.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 216, 230));
        jLabel2.setText("name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, -1, -1));

        jLabel3.setBackground(new java.awt.Color(22, 25, 28));
        jLabel3.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(173, 216, 230));
        jLabel3.setText("type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, -1, -1));

        jLabel4.setBackground(new java.awt.Color(22, 25, 28));
        jLabel4.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(173, 216, 230));
        jLabel4.setText("age:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, -1, -1));

        jLabel5.setBackground(new java.awt.Color(22, 25, 28));
        jLabel5.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 29, 123, 21));

        jLabel6.setBackground(new java.awt.Color(22, 25, 28));
        jLabel6.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 128, 130, 21));

        jLabel7.setBackground(new java.awt.Color(22, 25, 28));
        jLabel7.setFont(new java.awt.Font("JetBrainsMono NF", 1, 15)); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 77, 118, 21));

        jButton2.setBackground(new java.awt.Color(22, 25, 28));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println(petId);
                petRepository.delte(petId);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 40, 30));

        jButton3.setBackground(new java.awt.Color(22, 25, 28));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png")));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRequestForum popup = new AddRequestForum();
                System.out.println(getPetId());
                popup.setPetId(getPetId());
                popup.setVisible(true);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 40, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 240, 210));

        jLabel1.setBackground(new java.awt.Color(22, 25, 28));
        jLabel1.setForeground(new java.awt.Color(22, 25, 28));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 146));
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private PetRepository petRepository;
    private int petId;
    // End of variables declaration//GEN-END:variables
}
