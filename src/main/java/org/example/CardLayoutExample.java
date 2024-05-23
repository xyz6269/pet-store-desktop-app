package org.example;
import javax.swing.*;
import java.awt.*;

public class CardLayoutExample extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public CardLayoutExample() {
        setTitle("CardLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main container with CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create and add panels to the cardPanel
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        cardPanel.add(panel1, "panel1");

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        cardPanel.add(panel2, "panel2");

        // Add the cardPanel to the frame
        add(cardPanel);

        // Button to switch between panels
        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(e -> {
            cardLayout.next(cardPanel); // Switch to the next panel
        });
        add(switchButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardLayoutExample::new);
    }
}
