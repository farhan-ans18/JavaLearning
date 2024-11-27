package com.kodnest.task;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LinkedListFrame extends JFrame {

    private JPanel contentPane;
    private JTextField inputField;
    private JTextField listDisplay;
    private Node head;

    // Define the structure for Linked List Node
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LinkedListFrame frame = new LinkedListFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame for Linked List operations.
     */
    public LinkedListFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 0, 255)); // Set Magenta background
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title for Linked List Operations
        JLabel lblListOperations = new JLabel("Linked List Operations");
        lblListOperations.setBounds(150, 10, 150, 20);
        contentPane.add(lblListOperations);

        // Input Field for Linked List Insertion
        inputField = new JTextField();
        inputField.setBounds(30, 50, 150, 25);
        contentPane.add(inputField);
        inputField.setColumns(10);

        // Button for Insert Operation
        JButton btnInsert = new JButton("Insert");
        btnInsert.setBackground(new Color(144, 238, 144)); // Light green color
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int data = Integer.parseInt(inputField.getText());
                    insert(data);
                    inputField.setText("");
                    listDisplay.setText("Inserted: " + data);
                } catch (NumberFormatException ex) {
                    listDisplay.setText("Invalid input. Enter an integer.");
                }
            }
        });
        btnInsert.setBounds(200, 50, 100, 25);
        contentPane.add(btnInsert);

        // Button for Delete Operation
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBackground(new Color(255, 182, 193)); // Light pink color
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (head == null) {
                    listDisplay.setText("List is empty, nothing to delete.");
                } else {
                    listDisplay.setText("Deleted: " + head.data);
                    delete();
                }
            }
        });
        btnDelete.setBounds(200, 90, 100, 25);
        contentPane.add(btnDelete);

        // Button to Display Linked List contents
        JButton btnDisplay = new JButton("Display List");
        btnDisplay.setBackground(new Color(173, 216, 230)); // Light blue color
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateListDisplay();
            }
        });
        btnDisplay.setBounds(130, 130, 150, 25);
        contentPane.add(btnDisplay);

        // Text Field to Display the Linked List Content
        listDisplay = new JTextField();
        listDisplay.setEditable(false);
        listDisplay.setBounds(30, 170, 320, 30);
        contentPane.add(listDisplay);
        listDisplay.setColumns(10);
    }

    // Insert a new node at the end of the linked list
    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete the first node from the linked list
    private void delete() {
        if (head != null) {
            head = head.next;
        }
    }

    // Update the linked list display
    private void updateListDisplay() {
        if (head == null) {
            listDisplay.setText("List is empty.");
        } else {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            sb.append("Linked List: ");
            while (temp != null) {
                sb.append(temp.data).append(" ");
                temp = temp.next;
            }
            listDisplay.setText(sb.toString());
        }
    }
}
