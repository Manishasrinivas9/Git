package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField t1;
	private JTextField textfield_1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("login");
		lblNewLabel_2.setBounds(198, 23, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(172, 75, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=t1.getText();
				String password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "hello"+user="\n password is "+password);
				if(user.equals("manisha")&& password.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "valid user");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "valid user");
				}
			}
		});
		btnNewButton.setBounds(169, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("user name");
		lblNewLabel_3.setBounds(77, 78, 65, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel password = new JLabel("password");
		password.setBounds(75, 130, 67, 14);
		frame.getContentPane().add(password);
		
		p1 = new JPasswordField();
		p1.setBounds(172, 127, 86, 20);
		frame.getContentPane().add(p1);
	}
}
