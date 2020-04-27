package finalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InteractiveUsername {

	private JFrame frame;
	private JTextField txtWhatIsYour;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteractiveUsername window = new InteractiveUsername();
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
	public InteractiveUsername() {
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
		
		txtWhatIsYour = new JTextField();
		txtWhatIsYour.setText("                   What is your username (all lowercase)");
		txtWhatIsYour.setForeground(new Color(0, 51, 255));
		txtWhatIsYour.setColumns(30);
		txtWhatIsYour.setBackground(new Color(255, 204, 153));
		txtWhatIsYour.setBounds(51, 39, 339, 26);
		frame.getContentPane().add(txtWhatIsYour);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				System.out.println(name);
}
		});
		textField.setBounds(159, 121, 183, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
