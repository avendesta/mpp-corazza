package lesson6.labs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class AddBookPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel mainPanel;
	// title panel
	JPanel titlePanel;
	JLabel titleLabel;
	JTextField titleField;
	JButton addButton;

	public AddBookPanel() {
		mainPanel = new JPanel(new FlowLayout());

		titlePanel = new JPanel(new BorderLayout());
		titleLabel = new JLabel("Book title");
		titleField = new JTextField(10);
		addButton = new JButton("Add");
		titlePanel.add(titleLabel, BorderLayout.NORTH);
		titlePanel.add(titleField, BorderLayout.CENTER);
		titlePanel.add(addButton, BorderLayout.SOUTH);

		mainPanel.add(titlePanel, FlowLayout.LEFT);
		add(mainPanel);

		addButton.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String x = Util.Deserialize();
					titleLabel.setText(x);
					Util.Serialize(titleField.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}
