package com.encapsulation.serviceclass;

import java.util.Scanner;
import com.encapsulation.baseclass.UserAccount;

public class UserAccountService {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validate = true;

        do {
            // Ask user to enter details
            System.out.println("Enter User Name:");
            String uname = sc.nextLine();

            System.out.println("Enter User Password (At least 8 chars, 1 digit, 1 uppercase):");
            String upassword = sc.nextLine();

            System.out.println("Enter User Email (must contain '@' and end with '.com'):");
            String uemail = sc.nextLine();

            // Create object using constructor
            UserAccount user = new UserAccount(uname, upassword, uemail);

            // Display user info if valid
            user.displayInfo();

            // Ask if user wants to try again
            System.out.println("Do you want to check another user? (yes/no)");
            String choice = sc.nextLine();

            // Fixing loop logic - only continue if user says 'yes'
            if (choice.equalsIgnoreCase("yes")) {
                validate = true;
            } else {
                validate = false;
                System.out.println("Thanks for using the system!");
            }

        } while (validate);

        sc.close(); // good practice to close scanner
    }
}
