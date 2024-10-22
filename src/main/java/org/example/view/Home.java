/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.view;

import org.example.model.Pet;
import org.example.repository.PetRepository;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author xyz6269
 */
public class Home extends javax.swing.JPanel {

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

        setBackground(new java.awt.Color(45, 50, 55));
        setMaximumSize(new java.awt.Dimension(879, 698));
        setMinimumSize(new java.awt.Dimension(879, 698));
        setPreferredSize(new java.awt.Dimension(879, 698));
        setLayout(new java.awt.GridLayout(0, 5, 12, 100));
        for (Pet pet : petRepository.findAll()) {
            PetItem item = mapToPetItems(pet);
            System.out.println(item.getjLabel1());
            add(item);
        }
    }// </editor-fold>//GEN-END:initComponents

    private PetItem mapToPetItems(Pet pet) {
        PetItem item = new PetItem();
        ImageIcon icon = new ImageIcon(getClass().getResource(pet.getPicture()));
        Image scaledImage = icon.getImage().getScaledInstance(240, 146, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        item.getjLabel7().setText(String.valueOf(pet.getAge()));
        item.getjLabel5().setText(pet.getName());
        item.getjLabel6().setText(pet.getType());
        item.setPetId(pet.getId());
        item.getjLabel1().setIcon(scaledIcon);
        return item;
    }

    private PetRepository petRepository = new PetRepository();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
