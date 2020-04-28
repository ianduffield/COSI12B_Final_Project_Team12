package finalProj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class usertype extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String name;

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usertype frame = new usertype();
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
	public String usertype1() {

		this.name = null;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				 name = textField.getText();
			}
		});
		textField.setBounds(164, 97, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		return name;

	}
}
