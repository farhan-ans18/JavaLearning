package com.kodnest.task;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import java.util.Stack;

public class StackFrame extends JFrame {

    private JPanel contentPane;
    private JTextField inputField;
    private JTextField stackDisplay;
    private JComboBox<String> dataTypeComboBox; // ComboBox for data type selection
    private Stack<Object> stack = new Stack<>(); // Use Object to handle different types

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                StackFrame frame = new StackFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public StackFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 139));  // Dark Blue background
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblStackOperations = new JLabel("Stack Operations");
        lblStackOperations.setBounds(140, 10, 120, 20);
        lblStackOperations.setForeground(Color.WHITE);  // Set label color to white
        lblStackOperations.setFont(new Font("Segoe UI", Font.BOLD, 16));
        contentPane.add(lblStackOperations);

        inputField = new JTextField();
        inputField.setBounds(30, 50, 150, 25);
        inputField.setFont(new Font("Segoe UI", Font.BOLD, 14));
        inputField.setBackground(new Color(230, 230, 250));  // Light Lavender background
        inputField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        contentPane.add(inputField);
        inputField.setColumns(10);

        // ComboBox for data type selection
        String[] dataTypes = {"Select Data Type", "Integer", "String", "Character", "Float"};
        dataTypeComboBox = new JComboBox<>(dataTypes);
        dataTypeComboBox.setBounds(200, 50, 150, 25);
        dataTypeComboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
        contentPane.add(dataTypeComboBox);

        JButton btnPush = new JButton("Push");
        styleButton(btnPush, new Color(144, 238, 144));  // Light Green
        btnPush.addActionListener(e -> {
            String selectedDataType = (String) dataTypeComboBox.getSelectedItem();
            String value = inputField.getText();

            if ("Integer".equals(selectedDataType)) {
                // Validate for Integer
                try {
                    int intValue = Integer.parseInt(value);
                    stack.push(intValue);
                    stackDisplay.setText("Pushed: " + intValue);
                } catch (NumberFormatException ex) {
                    stackDisplay.setText("Error: Please enter a valid integer!");
                }
            } else if ("String".equals(selectedDataType)) {
                stack.push(value);
                stackDisplay.setText("Pushed: " + value);
            } else if ("Character".equals(selectedDataType)) {
                if (value.length() == 1) {
                    char charValue = value.charAt(0);
                    stack.push(charValue);
                    stackDisplay.setText("Pushed: " + charValue);
                } else {
                    stackDisplay.setText("Error: Please enter a single character!");
                }
            } else if ("Float".equals(selectedDataType)) {
                try {
                    float floatValue = Float.parseFloat(value);
                    stack.push(floatValue);
                    stackDisplay.setText("Pushed: " + floatValue);
                } catch (NumberFormatException ex) {
                    stackDisplay.setText("Error: Please enter a valid float!");
                }
            } else {
                stackDisplay.setText("Error: Please select a data type!");
            }
            inputField.setText("");  // Clear input field
        });
        btnPush.setBounds(30, 90, 100, 25);
        contentPane.add(btnPush);

        JButton btnPop = new JButton("Pop");
        styleButton(btnPop, new Color(255, 99, 71));  // Tomato Red
        btnPop.addActionListener(e -> {
            if (!stack.isEmpty()) {
                Object poppedValue = stack.pop();
                stackDisplay.setText("Popped: " + poppedValue);
            } else {
                stackDisplay.setText("Error: Stack is empty!");
            }
        });
        btnPop.setBounds(200, 90, 100, 25);
        contentPane.add(btnPop);

        // Button to Display Stack contents
        JButton btnDisplay = new JButton("Display");
        styleButton(btnDisplay, new Color(135, 206, 235));  // Sky Blue
        btnDisplay.addActionListener(e -> {
            if (!stack.isEmpty()) {
                stackDisplay.setText("Stack: " + stack.toString());
            } else {
                stackDisplay.setText("Error: Stack is empty!");
            }
        });
        btnDisplay.setBounds(30, 130, 150, 25);
        contentPane.add(btnDisplay);

        // Button to show the size of the stack
        JButton btnSize = new JButton("Size");
        styleButton(btnSize, new Color(255, 165, 0));  // Orange
        btnSize.addActionListener(e -> {
            stackDisplay.setText("Size: " + stack.size());
        });
        btnSize.setBounds(200, 130, 100, 25);
        contentPane.add(btnSize);

        stackDisplay = new JTextField();
        stackDisplay.setEditable(false);
        stackDisplay.setBounds(30, 170, 320, 25);
        stackDisplay.setFont(new Font("Segoe UI", Font.BOLD, 14));
        stackDisplay.setBackground(new Color(230, 230, 250));  // Light Lavender background for display
        stackDisplay.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        contentPane.add(stackDisplay);
        stackDisplay.setColumns(10);
    }

    /**
     * Apply custom styling to buttons.
     */
    private void styleButton(JButton button, Color bgColor) {
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(bgColor);
        button.setForeground(Color.BLACK);  // Darker text for contrast
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Hover effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(button.getBackground().darker());  // Darken the button color on hover
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(bgColor);  // Restore original color on exit
            }
        });
    }
}
