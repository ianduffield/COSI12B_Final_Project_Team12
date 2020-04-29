package finalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class WelcomeMessage extends JFrame {
	
	public WelcomeMessage() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/Ghazal/Desktop/COSI12B_Final_Project_Team12/Screen Shot 2020-04-28 at 19.45.06.png"));
		lblNewLabel_1.setBounds(167, 50, 85, 131);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Please use the command line to operate this quiz app");
		lblNewLabel_2.setFont(new Font("Skia", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(46, 172, 362, 47);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Platinum Trivia App!\n");
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 18));
		lblNewLabel.setBounds(70, 6, 324, 67);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("cs12b, April 2020, Cs12b Final Project By: Eric Hu, Ian Duffield, Ghazal Hashemimpour, and William Huynh");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblNewLabel_3.setBounds(17, 221, 427, 51);
		panel.add(lblNewLabel_3);
	}
	/**
	 * 
	 */

	public String name;

	private JPanel contentPane;
	private JTextField textField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeMessage frame = new WelcomeMessage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void welcomeMessage() {
					

		this.name = null;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();

		
		textField.setBounds(164, 97, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

	}
}
