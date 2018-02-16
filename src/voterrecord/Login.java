package voterrecord;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

class Login
{
    String userID, password;

    Login() {
        getIDandPassword();
    }

    // modal dialog to get user ID and password
    static String[] ConnectOptionNames = { "Login", "Cancel" };
    static String   ConnectTitle = "Gradesheet connection";
    void getIDandPassword() {
        JPanel      connectionPanel;

 	// Create the labels and text fields.
	JLabel     userNameLabel = new JLabel("User ID:   ", JLabel.RIGHT);
 	JTextField userNameField = new JTextField("");
	JLabel     passwordLabel = new JLabel("Password:   ", JLabel.RIGHT);
	JTextField passwordField = new JPasswordField("");
	connectionPanel = new JPanel(false);
	connectionPanel.setLayout(new BoxLayout(connectionPanel,
						BoxLayout.X_AXIS));
	JPanel namePanel = new JPanel(false);
	namePanel.setLayout(new GridLayout(0, 1));
	namePanel.add(userNameLabel);
	namePanel.add(passwordLabel);
	JPanel fieldPanel = new JPanel(false);
	fieldPanel.setLayout(new GridLayout(0, 1));
	fieldPanel.add(userNameField);
	fieldPanel.add(passwordField);
	connectionPanel.add(namePanel);
	connectionPanel.add(fieldPanel);

        // Connect or quit
	if(JOptionPane.showOptionDialog(null, connectionPanel, 
                                        ConnectTitle,
                                        JOptionPane.OK_CANCEL_OPTION, 
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null, ConnectOptionNames, 
                                        ConnectOptionNames[0]) != 0) 
        {
	    System.exit(0);
	}
        userID = userNameField.getText();
        password = passwordField.getText();
    }
}