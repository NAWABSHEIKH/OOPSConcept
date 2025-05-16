package com.abstraction.base;

// Interface defines the contract for any payment type
public interface Payment {
    
    // Every payment type must implement this method to process the payment
    public void processPayment();
}
