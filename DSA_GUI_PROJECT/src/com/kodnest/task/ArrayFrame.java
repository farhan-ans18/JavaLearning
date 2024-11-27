package com.kodnest.task;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

public class ArrayFrame extends JFrame {

    private JPanel contentPane;
    private JTextField inputField;
    private JTextField indexField;
    private JTextField arrayDisplay;
    private int[] array = new int[10];  // Initial array with 10 elements
    private int size = 0;  // Track the current size of the array
    private JComboBox<String> dataTypeComboBox; // ComboBox for data type selection

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ArrayFrame frame = new ArrayFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame for array operations.
     */
    public ArrayFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(34, 139, 34));  // Forest Green background
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title for Array Operations
        JLabel lblArrayOperations = new JLabel("Array Operations");
        lblArrayOperations.setBounds(150, 10, 150, 20);
        lblArrayOperations.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblArrayOperations.setForeground(Color.WHITE);
        contentPane.add(lblArrayOperations);

        // Input Field for Insertion Operation
        inputField = new JTextField();
        inputField.setBounds(30, 50, 150, 25);
        inputField.setFont(new Font("Segoe UI", Font.BOLD, 14));
        inputField.setBackground(new Color(230, 255, 230));  // Light green background for input
        inputField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        contentPane.add(inputField);
        inputField.setColumns(10);

        // JComboBox for selecting data type
        String[] dataTypes = {"Select Data Type", "Integer", "String", "Character", "Float"};
        dataTypeComboBox = new JComboBox<>(dataTypes);
        dataTypeComboBox.setBounds(200, 50, 150, 25);
        dataTypeComboBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
        contentPane.add(dataTypeComboBox);

        // Button for Insert Operation
        JButton btnInsert = new JButton("Insert");
        styleButton(btnInsert, new Color(144, 238, 144));  // Light Green
        btnInsert.addActionListener(e -> {
            String selectedDataType = (String) dataTypeComboBox.getSelectedItem();
            String inputValue = inputField.getText();

            try {
                switch (selectedDataType) {
                    case "Integer":
                        int intValue = Integer.parseInt(inputValue);
                        insertValue(intValue);
                        break;
                    case "String":
                        // Assuming string can be inserted as integer for demonstration
                        // In a real scenario, you might want to handle this differently
                        insertValue(inputValue);  
                        break;
                    case "Character":
                        if (inputValue.length() == 1) {
                            char charValue = inputValue.charAt(0);
                            insertValue(charValue);
                        } else {
                            arrayDisplay.setText("Error: Please enter a single character!");
                        }
                        break;
                    case "Float":
                        float floatValue = Float.parseFloat(inputValue);
                        // You might want to handle float values specifically as needed
                        insertValue(floatValue);
                        break;
                    default:
                        arrayDisplay.setText("Error: Please select a data type!");
                        break;
                }
            } catch (NumberFormatException ex) {
                arrayDisplay.setText("Invalid input! Please enter a valid value for the selected data type.");  // Handle invalid input
            }
        });
        btnInsert.setBounds(30, 90, 100, 25);
        contentPane.add(btnInsert);

        // Input Field for Deletion Index
        indexField = new JTextField();
        indexField.setBounds(30, 130, 150, 25);
        indexField.setFont(new Font("Segoe UI", Font.BOLD, 14));
        indexField.setBackground(new Color(230, 255, 230));  // Light green background for input
        indexField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        contentPane.add(indexField);
        indexField.setColumns(10);

        // Button for Delete Operation
        JButton btnDelete = new JButton("Delete");
        styleButton(btnDelete, new Color(255, 99, 71));  // Tomato Red
        btnDelete.addActionListener(e -> {
            try {
                int index = Integer.parseInt(indexField.getText());
                if (index >= 0 && index < size) {
                    int deletedValue = array[index];  // Store the value to be deleted
                    for (int i = index; i < size - 1; i++) {
                        array[i] = array[i + 1];  // Shift elements to the left
                    }
                    size--;  // Decrease size after deletion
                    arrayDisplay.setText("Deleted value: " + deletedValue + " from index: " + index);  // Show deletion message
                    indexField.setText("");  // Clear index field
                } else {
                    arrayDisplay.setText("Invalid index!");  // Notify if invalid index
                }
            } catch (NumberFormatException ex) {
                arrayDisplay.setText("Invalid input! Please enter an integer for index.");  // Handle invalid index input
            }
        });
        btnDelete.setBounds(200, 130, 100, 25);
        contentPane.add(btnDelete);

        // Button to Display Array contents
        JButton btnDisplay = new JButton("Display Array");
        styleButton(btnDisplay, new Color(135, 206, 235));  // Sky Blue
        btnDisplay.addActionListener(e -> updateArrayDisplay());  // Display the array contents
        btnDisplay.setBounds(30, 170, 120, 25);
        contentPane.add(btnDisplay);

        // Button to Display the Size of the Array
        JButton btnSize = new JButton("Array Size");
        styleButton(btnSize, new Color(255, 165, 0));  // Orange
        btnSize.addActionListener(e -> {
            arrayDisplay.setText("Size: " + size);  // Show current size of the array
        });
        btnSize.setBounds(200, 170, 120, 25);
        contentPane.add(btnSize);

        // Text Field to Display the Array Content
        arrayDisplay = new JTextField();
        arrayDisplay.setEditable(false);  // Set to non-editable
        arrayDisplay.setBounds(30, 210, 320, 30);
        arrayDisplay.setFont(new Font("Segoe UI", Font.BOLD, 14));
        arrayDisplay.setBackground(new Color(230, 255, 230));  // Light green background for display
        arrayDisplay.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        contentPane.add(arrayDisplay);
        arrayDisplay.setColumns(10);
    }

    /**
     * Insert the value into the array.
     */
    private void insertValue(Object value) {
        if (size < array.length) {
            if (value instanceof Integer) {
                array[size] = (int) value;
                arrayDisplay.setText("Inserted: " + value);  // Show inserted message
            } else if (value instanceof String) {
                // Assuming string can be converted to int for demonstration
                // In a real scenario, you might want to handle this differently
                try {
                    array[size] = Integer.parseInt((String) value);
                    arrayDisplay.setText("Inserted: " + value);  // Show inserted message
                } catch (NumberFormatException e) {
                    arrayDisplay.setText("Invalid String input!");  // Handle invalid string input
                    return;
                }
            } else if (value instanceof Character) {
                // You might want to handle char input specifically as needed
                arrayDisplay.setText("Inserted character: " + value);  // Show inserted message
            } else if (value instanceof Float) {
                // Handle float input specifically if necessary
                arrayDisplay.setText("Inserted float: " + value);  // Show inserted message
            }
            size++;
            inputField.setText("");  // Clear input field
        } else {
            arrayDisplay.setText("Array is full!");  // Notify if array is full
        }
    }

    /**
     * Update the array display field to show current array elements.
     */
    private void updateArrayDisplay() {
        if (size > 0) {
            int[] displayedArray = Arrays.copyOf(array, size);  // Copy only the valid elements
            arrayDisplay.setText("Array: " + Arrays.toString(displayedArray));
        } else {
            arrayDisplay.setText("Array is empty!");  // Notify if the array is empty
        }
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
