package finalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InteractiveWindow {

	private JFrame frame;
	private JTextField txtWelcomeToGroup;
	private JTextField txtWhichOfThe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteractiveWindow window = new InteractiveWindow();
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
	public InteractiveWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("Focus.color"));
		frame.getContentPane().setForeground(UIManager.getColor("EditorPane.background"));
		frame.getContentPane().setBackground(new Color(255, 204, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		
		txtWelcomeToGroup = new JTextField();
		txtWelcomeToGroup.setBackground(Color.PINK);
		txtWelcomeToGroup.setForeground(new Color(102, 51, 204));
		txtWelcomeToGroup.setText("                Welcome to Group 12 Quiz Application");
		frame.getContentPane().add(txtWelcomeToGroup);
		txtWelcomeToGroup.setColumns(30);
		
		txtWhichOfThe = new JTextField();
		txtWhichOfThe.setForeground(new Color(0, 51, 255));
		txtWhichOfThe.setBackground(new Color(255, 204, 153));
		txtWhichOfThe.setText("                     Which of the following are you?");
		frame.getContentPane().add(txtWhichOfThe);
		txtWhichOfThe.setColumns(30);
		
		JButton btnNewButton = new JButton("Guest");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setForeground(new Color(165, 42, 42));
		btnNewButton.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.setForeground(new Color(165, 42, 42));
		btnNewUser.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(btnNewUser);
		
		JButton btnReturningUser = new JButton("Returning User");
		btnReturningUser.setForeground(new Color(165, 42, 42));
		btnReturningUser.setBackground(new Color(255, 240, 245));
		frame.getContentPane().add(btnReturningUser);
	}

}
