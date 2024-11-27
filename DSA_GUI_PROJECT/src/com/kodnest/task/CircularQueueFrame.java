package com.kodnest.task;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircularQueueFrame extends JFrame {

    private JPanel contentPane;
    private JTextField inputField;
    private JTextArea queueDisplay;  // Changed to JTextArea for better formatting
    private int[] queue;
    private int front, rear, size, capacity;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CircularQueueFrame frame = new CircularQueueFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame for Circular Queue operations.
     */
    public CircularQueueFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 215, 0));  // Dark Yellow Background
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Initialize Circular Queue
        capacity = 5;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity - 1;

        // Title for Circular Queue Operations
        JLabel lblQueueOperations = new JLabel("Circular Queue Operations");
        lblQueueOperations.setBounds(130, 10, 200, 20);
        contentPane.add(lblQueueOperations);

        // Input Field for Enqueue Operation
        inputField = new JTextField();
        inputField.setBounds(30, 50, 150, 25);
        contentPane.add(inputField);
        inputField.setColumns(10);
        inputField.setFont(new Font("Segoe UI", Font.BOLD, 14));   

        // Button for Enqueue Operation
        JButton btnEnqueue = createButton("Enqueue", 200, 50, Color.CYAN, e -> {
            enqueue(Integer.parseInt(inputField.getText()));
            inputField.setText("");
        });
        contentPane.add(btnEnqueue);

        // Button for Dequeue Operation
        JButton btnDequeue = createButton("Dequeue", 200, 90, Color.MAGENTA, e -> {
            dequeue();
        });
        contentPane.add(btnDequeue);

        // Button to Show Front Element
        JButton btnFront = createButton("Front Element", 30, 130, Color.CYAN, e -> {
            if (!isEmpty()) {
                queueDisplay.setText("Front: " + queue[front]);
            } else {
                queueDisplay.setText("Queue is empty");
            }
        });
        contentPane.add(btnFront);

        // Button to Show Rear Element
        JButton btnRear = createButton("Rear Element", 200, 130, Color.BLUE, e -> {
            if (!isEmpty()) {
                queueDisplay.setText("Rear: " + queue[rear]);
            } else {
                queueDisplay.setText("Queue is empty");
            }
        });
        contentPane.add(btnRear);

        // Button to Display Queue contents
        JButton btnDisplay = createButton("Display Queue", 130, 170, Color.GREEN, e -> {
            updateQueueDisplay();
        });
        contentPane.add(btnDisplay);

        // Text Area to Display the Queue Content
        queueDisplay = new JTextArea();
        queueDisplay.setEditable(false);
        queueDisplay.setBounds(30, 210, 320, 50);
        queueDisplay.setLineWrap(true);
        queueDisplay.setWrapStyleWord(true);
        contentPane.add(queueDisplay);
        queueDisplay.setFont(new Font("Segoe UI", Font.BOLD, 14)); 
    }

    // Create a button with specific properties
    private JButton createButton(String text, int x, int y, Color color, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 30); // Increased button height for better visibility
        button.addActionListener(actionListener);
        button.setBackground(color); // Button color
        button.setForeground(Color.BLACK);
        return button;
    }

    // Enqueue operation for Circular Queue
    private void enqueue(int value) {
        if (isFull()) {
            queueDisplay.setText("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        queueDisplay.setText("Enqueued: " + value); // Display enqueue message
    }

    // Dequeue operation for Circular Queue
    private void dequeue() {
        if (isEmpty()) {
            queueDisplay.setText("Queue is empty");
            return;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        queueDisplay.setText("Dequeued: " + value); // Display dequeue message
    }

    // Check if the queue is full
    private boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Update queue display
    private void updateQueueDisplay() {
        if (isEmpty()) {
            queueDisplay.setText("Queue is empty");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Circular Queue: \n");
            for (int i = 0; i < size; i++) {
                sb.append(queue[(front + i) % capacity]).append("\n");
            }
            queueDisplay.setText(sb.toString());
        }
    }
}
