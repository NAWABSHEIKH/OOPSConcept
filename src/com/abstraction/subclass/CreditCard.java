package com.abstraction.subclass;

import com.abstraction.base.Payment;

public class CreditCard implements Payment {
    String uniqueNum;  // stores the credit card number
    int amount;        // amount to be paid

    // Constructor to initialize credit card number and amount
    public CreditCard(String uniqueNum, int amount) {
        this.uniqueNum = uniqueNum;
        this.amount = amount;
    }

    // Implement the processPayment method from Payment interface
    @Override
    public void processPayment() {
        // Validate credit card number length (should be exactly 16 digits)
        if (this.uniqueNum.length() == 16) {
            System.out.println("Your CreditCard number is: " + this.uniqueNum);
            System.out.println("Amount Entered: " + this.amount);
        } else {
            System.out.println("Sorry, your Card Number is not valid.");
        }
    }
}
