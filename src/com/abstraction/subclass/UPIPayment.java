package com.abstraction.subclass;

import com.abstraction.base.Payment;

public class UPIPayment implements Payment {
    String uniqueNum;  // stores the UPI ID
    int amount;        // amount to be paid

    // Constructor to initialize UPI ID and amount
    public UPIPayment(String uniqueNum, int amount) {
        this.uniqueNum = uniqueNum;
        this.amount = amount;
    }

    // Implement the processPayment method from Payment interface
    @Override
    public void processPayment() {
        // Check if UPI ID contains '@' which is a simple validity check
        if (uniqueNum.contains("@")) {
            System.out.println("Your UPI number is: " + uniqueNum);
            System.out.println("Amount Entered: " + amount);
        } else {
            System.out.println("Sorry, your UPI does not contain '@'.");
        }
    }
}
