package caluclator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(249, 11, 135, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(45, 93, 60, 32);
		contentPane.add(lblNewLabel_1);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldNum1.setBounds(115, 89, 423, 47);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Num2");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(45, 173, 70, 22);
		contentPane.add(lblNewLabel_3);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setForeground(new Color(0, 0, 0));
		textFieldNum2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNum2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldNum2.setBounds(115, 164, 423, 47);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Operations");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(272, 235, 121, 32);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add(+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    int num1 = Integer.parseInt(textFieldNum1.getText());
                    int num2 = Integer.parseInt(textFieldNum2.getText());

                    // Perform the addition
                    int result = num1 + num2;

                    // Display the result in the label
                    textFieldAns.setText("" + result);
                } catch (NumberFormatException ex) {
                    // Handle case when input is not a valid number
                    textFieldAns.setText("Please enter valid numbers!");
                }
            }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(169, 169, 169));
		btnNewButton.setBounds(45, 298, 93, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtract(-)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // Get the numbers from the text fields
                    int num1 = Integer.parseInt(textFieldNum1.getText());
                    int num2 = Integer.parseInt(textFieldNum2.getText());

                    // Perform the addition
                    int result = num1 - num2;

                    // Display the result in the label
                    textFieldAns.setText("" + result);
                } catch (NumberFormatException ex) {
                    // Handle case when input is not a valid number
                    textFieldAns.setText("Please enter valid numbers!");
                }
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(169, 169, 169));
		btnNewButton_1.setBounds(182, 298, 121, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiply(*)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // Get the numbers from the text fields
                    int num1 = Integer.parseInt(textFieldNum1.getText());
                    int num2 = Integer.parseInt(textFieldNum2.getText());

                    // Perform the addition
                    int result = num1 * num2;

                    // Display the result in the label
                    textFieldAns.setText("" + result);
                } catch (NumberFormatException ex) {
                    // Handle case when input is not a valid number
                    textFieldAns.setText("Please enter valid numbers!");
                }
			}
		});
		btnNewButton_2.setBackground(new Color(169, 169, 169));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(344, 298, 121, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide(/)");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(textFieldNum1.getText());
                    double num2 = Double.parseDouble(textFieldNum2.getText());

                    // Perform the division
                    if (num2 != 0) {
                        double result = num1 / num2;
                        textFieldAns.setText("" + result);
                    } else {
                        textFieldAns.setText("Cannot divide by zero!");
                    }
                } catch (NumberFormatException ex) {
                    // Handle case when input is not a valid number
                    textFieldAns.setText("Please enter valid numbers!");
                }
			}
		});
		btnNewButton_3.setBackground(new Color(169, 169, 169));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(500, 298, 112, 32);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("Output");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(45, 406, 76, 32);
		contentPane.add(lblNewLabel_4);
		
		textFieldAns = new JTextField();
		textFieldAns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAns.setFont(new Font("Tahoma", Font.BOLD, 18));
		textFieldAns.setBounds(124, 392, 431, 63);
		contentPane.add(textFieldAns);
		textFieldAns.setColumns(10);
	}
}
