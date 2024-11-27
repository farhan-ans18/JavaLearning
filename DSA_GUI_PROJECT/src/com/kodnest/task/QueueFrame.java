package com.kodnest.task;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFrame extends JFrame {

    private JPanel contentPane;
    private JTextField inputField;
    private JTextField queueDisplay;
    private Queue<Integer> queue = new LinkedList<>();  // Using LinkedList to implement Queue

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                QueueFrame frame = new QueueFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame for Queue operations.
     */
    public QueueFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.YELLOW);  // Set background color to yellow
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title for Queue Operations
        JLabel lblQueueOperations = new JLabel("Queue Operations");
        lblQueueOperations.setBounds(150, 10, 150, 20);
        contentPane.add(lblQueueOperations);

        // Input Field for Enqueue Operation
        inputField = new JTextField();
        inputField.setBounds(30, 50, 150, 25);
        contentPane.add(inputField);
        inputField.setColumns(10);

        // Button for Enqueue Operation
        JButton btnEnqueue = createButton("Enqueue", 200, 50, e -> enqueue());
        contentPane.add(btnEnqueue);

        // Button for Dequeue Operation
        JButton btnDequeue = createButton("Dequeue", 200, 90, e -> dequeue());
        contentPane.add(btnDequeue);

        // Button to Peek at the front element
        JButton btnPeek = createButton("Peek", 200, 130, e -> peek());
        contentPane.add(btnPeek);

        // Button to Display Queue contents
        JButton btnDisplay = createButton("Display Queue", 125, 170, e -> updateQueueDisplay());
        contentPane.add(btnDisplay);

        // Text Field to Display the Queue Content
        queueDisplay = new JTextField();
        queueDisplay.setEditable(false);  // Set to non-editable
        queueDisplay.setBounds(30, 210, 320, 30);
        contentPane.add(queueDisplay);
        queueDisplay.setColumns(10);
    }

    /**
     * Create a button with specific properties.
     */
    private JButton createButton(String text, int x, int y, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 150, 25);
        button.addActionListener(actionListener);
        button.setBackground(Color.CYAN); // Button color
        button.setForeground(Color.BLACK);
        return button;
    }

    /**
     * Enqueue operation.
     */
    private void enqueue() {
        String input = inputField.getText();  // Get input from the text field
        try {
            int value = Integer.parseInt(input);
            queue.add(value);  // Add value to queue
            inputField.setText("");  // Clear input field
            queueDisplay.setText("Enqueued: " + value);  // Show success message
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Dequeue operation.
     */
    private void dequeue() {
        if (!queue.isEmpty()) {
            int removedValue = queue.poll();  // Remove the front element from the queue
            queueDisplay.setText("Dequeued: " + removedValue);  // Show success message
        } else {
            queueDisplay.setText("Queue is empty!");  // Notify if queue is empty
        }
    }

    /**
     * Peek operation to see the front element without removing it.
     */
    private void peek() {
        if (!queue.isEmpty()) {
            Integer front = queue.peek();  // Get the front element without removing
            queueDisplay.setText("Front element: " + front);  // Display front element
        } else {
            queueDisplay.setText("Queue is empty!");  // Notify if queue is empty
        }
    }

    /**
     * Update the queue display field to show current queue elements.
     */
    private void updateQueueDisplay() {
        if (queue.isEmpty()) {
            queueDisplay.setText("Queue is empty!");  // Notify if queue is empty
        } else {
            queueDisplay.setText("Queue: " + queue.toString());  // Display queue elements
        }
    }
}
