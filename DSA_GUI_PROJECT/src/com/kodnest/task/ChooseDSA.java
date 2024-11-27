package com.kodnest.task;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseDSA extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ChooseDSA frame = new ChooseDSA();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ChooseDSA() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400); // Set desired width and height
        setExtendedState(JFrame.NORMAL); // Ensure the frame is in normal state
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        // Set the background color to dark blue
        contentPane.setBackground(Color.DARK_GRAY);  

        // Add Title Label
        JLabel lblTitle = new JLabel("CHOOSE DATA STRUCTURE");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitle.setForeground(Color.WHITE); // Change to white for better visibility
        lblTitle.setBounds(130, 30, 300, 30);
        contentPane.add(lblTitle);
        
        // Create buttons without images
        JButton btnArray = createButton("Array", 60, 80, e -> new ArrayFrame().setVisible(true), Color.GREEN);
        contentPane.add(btnArray);

        JButton btnStack = createButton("Stack", 250, 80, e -> new StackFrame().setVisible(true), Color.CYAN);
        contentPane.add(btnStack);

        JButton btnQueue = createButton("Queue", 60, 160, e -> new QueueFrame().setVisible(true), Color.YELLOW);
        contentPane.add(btnQueue);

        JButton btnCircularQueue = createButton("Circular Queue", 250, 160, e -> new CircularQueueFrame().setVisible(true), Color.ORANGE);
        contentPane.add(btnCircularQueue);

        JButton btnLinkedList = createButton("Linked List", 150, 240, e -> new LinkedListFrame().setVisible(true), Color.MAGENTA);
        contentPane.add(btnLinkedList);

        setLocationRelativeTo(null); // Center the window 
    }

    private JButton createButton(String text, int x, int y, ActionListener actionListener, Color bgColor) {
        JButton button = new JButton(text);
        styleButton(button, bgColor); // Pass the button's background color
        button.setBounds(x, y, 160, 50);
        button.addActionListener(actionListener);
        return button;
    }

    private void styleButton(JButton button, Color bgColor) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setBackground(bgColor);
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setBorder(null);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(button.getBackground().darker());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(bgColor);
            }
        });
    }
}
