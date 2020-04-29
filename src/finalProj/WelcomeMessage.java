package finalProj;
/**
 *Pop up window to welcome the user. It then asks if the user is ready and once the user clicks ready, this Jframe hides itself and new Jframe appears.
 *
 *
 * @author Ghazal
 *
 */
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
import javax.swing.JButton;

public class WelcomeMessage extends JFrame {
	
	public WelcomeMessage() {
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/Ghazal/Desktop/COSI12B_Final_Project_Team12/Screen Shot 2020-04-28 at 19.45.06.png"));
		lblNewLabel_1.setBounds(253, 72, 79, 118);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("This is a quiz app that allows you to answer quiz Qs base on pre-existing quizes. \n");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Skia", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(26, 173, 548, 51);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Welcome to the Platinum Trivia App!\n");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 23));
		lblNewLabel.setBounds(98, 6, 416, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("cs12b, April 2020, Cs12b Final Project By: Eric Hu, Ian Duffield, Ghazal Hashemimpour, and William Huynh");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(6, 350, 568, 51);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("You can even make you own quizes!");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_4.setForeground(Color.MAGENTA);
		lblNewLabel_4.setBounds(122, 217, 427, 29);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Press When Ready");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameInput x = new UsernameInput();
				setVisible(false);
				x.setVisible(true);
			}

		});
		btnNewButton.setFont(new Font("Muna", Font.PLAIN, 13));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(211, 281, 185, 55);
		panel.add(btnNewButton);
					
	}
	
	/**
	
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

	**/


	public JPanel contentPane;
	public JTextField textField;

	


	
	public void welcomeMessage2() {
		

		

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		
		
		/**
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();

		
		textField.setBounds(164, 97, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
**/
	}
}
