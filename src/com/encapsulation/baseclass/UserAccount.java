package com.encapsulation.baseclass;

public class UserAccount {

    // Private fields - good encapsulation: only accessible via getter/setter
    private String username;
    private String password;
    private String email;

    // Constructor - used for quick setup of values while creating object
    public UserAccount(String username, String password, String email) {
        setUsername(username);   // using setter to apply validation logic if needed
        setPassword(password);
        setEmail(email);
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Setter for password with simple validation logic
    // Good Practice: Validating input inside setter makes class more secure and reusable
    public void setPassword(String password) {
        if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[A-Z].*")) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long, include a digit and an uppercase letter.");
            this.password = "invalid";
        }
    }

    // Setter for email with basic validation
    public void setEmail(String email) {
        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@") && !email.endsWith("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email! Must contain '@' and end with '.com', and not start/end with '@'");
            this.email = "invalid";
        }
    }

    // Getters - just return values
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    // Method to display info only if all data is valid
    public void displayInfo() {
        if (!email.equals("invalid") && !password.equals("invalid")) {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
        } else {
            System.out.println("User details are not complete or valid.");
        }
        System.out.println(); // adds spacing between users
    }
}
