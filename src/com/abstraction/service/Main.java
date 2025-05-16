package com.abstraction.service;

import java.util.Scanner;

import com.abstraction.base.Payment;
import com.abstraction.subclass.CreditCard;
import com.abstraction.subclass.UPIPayment;

public class Main {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        boolean checkOnce = true;

        do {
            System.out.println("Press 1 for CreditCard Payment.");
            System.out.println("Press 2 for UPI Payment.");

            // Read the user's choice (int)
            int n = ab.nextInt();
            // Consume the leftover newline after nextInt()
            ab.nextLine();

            switch (n) {
                case 1:
                    System.out.println("Enter your 16 digit CreditCard number.");
                    String credNumber = ab.nextLine();

                    System.out.println("Enter amount to be paid.");
                    int amount = ab.nextInt();
                    // Consume newline after nextInt()
                    ab.nextLine();

                    // Create CreditCard payment object and process payment
                    Payment p1 = new CreditCard(credNumber, amount);
                    p1.processPayment();
                    break;

                case 2:
                    System.out.println("Enter UPI Unique ID");
                    String UPINumber = ab.nextLine();

                    System.out.println("Enter amount to be paid.");
                    int amount2 = ab.nextInt();
                    // Consume newline after nextInt()
                    ab.nextLine();

                    // Create UPIPayment object and process payment
                    Payment p2 = new UPIPayment(UPINumber, amount2);
                    p2.processPayment();
                    break;

                default:
                    System.out.println("Please select between 1 & 2.");
                    break;
            }

            // Asking user if they want to repeat the transaction
            boolean validAnswer = false;
            while (!validAnswer) {
                System.out.println("======Do you want to repeat Transaction process? Type 'yes' or 'no' ========");
                String yesno = ab.nextLine().trim().toLowerCase();

                if (yesno.equals("yes")) {
                    checkOnce = true;
                    validAnswer = true; // valid input, exit this input loop
                } else if (yesno.equals("no")) {
                    checkOnce = false;
                    validAnswer = true; // valid input, exit this input loop
                } else {
                    System.out.println("Please select only 'yes' or 'no'.");
                }
            }

        } while (checkOnce);

        System.out.println("======Thank you for using our service.=======");
        ab.close();
    }
}
