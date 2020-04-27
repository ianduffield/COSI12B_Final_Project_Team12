package finalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class InteractiveWindow2 {

	private JFrame frame;
	private JTextField txtWelcomeToGroup;
	private JTextField txtWhichOfThe;
	private JButton button;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Launch the application.
	 * @author Ghazal
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteractiveWindow2 window = new InteractiveWindow2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InteractiveWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtWelcomeToGroup = new JTextField();
		txtWelcomeToGroup.setBounds(40, 25, 339, 26);
		txtWelcomeToGroup.setText("              Welcome to Group 12 Quiz Application");
		txtWelcomeToGroup.setForeground(new Color(102, 51, 204));
		txtWelcomeToGroup.setColumns(25);
		txtWelcomeToGroup.setBackground(Color.PINK);
		frame.getContentPane().add(txtWelcomeToGroup);

		txtWhichOfThe = new JTextField();
		txtWhichOfThe.setText("                   Which of the following are you?");
		txtWhichOfThe.setForeground(new Color(0, 51, 255));
		txtWhichOfThe.setColumns(30);
		txtWhichOfThe.setBackground(new Color(255, 204, 153));
		txtWhichOfThe.setBounds(40, 79, 339, 26);
		frame.getContentPane().add(txtWhichOfThe);

		button = new JButton("Guest");
		button.addActionListener(new ActionListener() {
			
			//action of the GUEST BUTTON
			public void actionPerformed(ActionEvent e) {
				
				UserInterface user = new UserInterface();
				try {
					UserInterface.run("guest");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setForeground(new Color(165, 42, 42));
		button.setBackground(new Color(255, 240, 245));
		button.setBounds(40, 129, 80, 29);
		frame.getContentPane().add(button);

		button_1 = new JButton("New User");
		button_1.addActionListener(new ActionListener() {
			//action of the NEW USER BUTTON
			public void actionPerformed(ActionEvent e) {
				InteractiveUsername user = new InteractiveUsername();
				user.run();
				
			}
		});
		button_1.setForeground(new Color(165, 42, 42));
		button_1.setBackground(new Color(255, 240, 245));
		button_1.setBounds(158, 129, 103, 29);
		frame.getContentPane().add(button_1);

		button_2 = new JButton("Returning User");
		button_2.addActionListener(new ActionListener() {
			
			//action of the RETURNING USER BUTTON

			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button_2.setForeground(new Color(165, 42, 42));
		button_2.setBackground(new Color(255, 240, 245));
		button_2.setBounds(282, 129, 137, 29);
		frame.getContentPane().add(button_2);
	}
}
