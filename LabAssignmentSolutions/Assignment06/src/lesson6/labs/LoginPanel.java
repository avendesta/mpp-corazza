package lesson6.labs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final LoginPanel INSTANCE = new LoginPanel();

	private static final ActionListener ActionListener = null;

	// main panel
	JPanel mainPanel;
	// login label
	JPanel loginLabelPanel;
	JLabel loginLabel;
	// login form
	JPanel loginFormPanel;

	JPanel usernamePanel;
	JTextField usernameField;
	JLabel usernameLabel;

	JPanel passwordPanel;
	JTextField passwordField;
	JLabel passwordLabel;
	// login button
	JPanel loginButtonPanel;
	JButton loginButton;

	private LoginPanel() {
	}; // singliton

	public LoginPanel init() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		setLabel();
		mainPanel.add(loginLabelPanel, BorderLayout.NORTH);
		setForm();
		mainPanel.add(loginFormPanel, BorderLayout.CENTER);
		setButton();
		mainPanel.add(loginButtonPanel, BorderLayout.SOUTH);

		INSTANCE.setLayout(new BorderLayout());
		INSTANCE.add(mainPanel, BorderLayout.NORTH);
		setVisibilityAction(loginButton);
		return INSTANCE;
	}

	void setLabel() {
		loginLabelPanel = new JPanel();
		loginLabelPanel.setLayout(new FlowLayout());
		loginLabel = new JLabel("Login");
		loginLabelPanel.add(loginLabel, FlowLayout.LEFT);
	}

	void setForm() {
		loginFormPanel = new JPanel(new FlowLayout());

		usernamePanel = new JPanel(new BorderLayout());
		usernameLabel = new JLabel("Username");
		usernameField = new JTextField(10);
		usernamePanel.add(usernameField, BorderLayout.NORTH);
		usernamePanel.add(usernameLabel, BorderLayout.CENTER);
		loginFormPanel.add(usernamePanel, FlowLayout.LEFT);

		passwordPanel = new JPanel(new BorderLayout());
		passwordLabel = new JLabel("Password");
		passwordField = new JTextField(10);
		passwordPanel.add(passwordField, BorderLayout.NORTH);
		passwordPanel.add(passwordLabel, BorderLayout.CENTER);
		loginFormPanel.add(passwordPanel, FlowLayout.LEFT);
	}

	void setButton() {
		loginButtonPanel = new JPanel(new FlowLayout());
		loginButton = new JButton("Submit");
		loginButtonPanel.add(loginButton, FlowLayout.LEFT);
	}

	void setVisibilityAction(JButton b) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginButtonPanel.setVisible(false);
			}
		});
	}

}
