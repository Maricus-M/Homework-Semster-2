package awt.api;

import java.awt.*; 
import java.awt.event.*; 

public class AWTAPI extends Frame implements ActionListener {

    // This is where i declared my components
    private Label nameLabel, emailLabel, phoneLabel;
    private TextField nameField, emailField, phoneField;
    private Button submitButton;

    // This is the constructor for the API
    public AWTAPI() {
        // This is where I set the layout of the frame
        setLayout(new FlowLayout());

        // Create Labels and TextFields
        nameLabel = new Label("Username:");
        nameField = new TextField(20);

        emailLabel = new Label("Email Address:");
        emailField = new TextField(20);

        phoneLabel = new Label("Phone Number:");
        phoneField = new TextField(20);

        // Create a button
        submitButton = new Button("Submit");

        // Add components to the Frame
        add(nameLabel);
        add(nameField);

        add(emailLabel);
        add(emailField);

        add(phoneLabel);
        add(phoneField);

        add(submitButton);

        // Register the button to listen for actions
        submitButton.addActionListener(this);

        // Set Frame properties
        setTitle("User Information Form");
        setSize(300, 200);
        setVisible(true);

        // Add a window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Method to handle button click events
    @Override
    public void actionPerformed(ActionEvent ae) {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();

        // Print the entered information in the terminal
        System.out.println("Username: " + name);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + phone);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the AWTAPI class to display the GUI
        new AWTAPI();
    }
}
