package com.ishan.design_patterns.structural.adapter.payment_example.external;

public class PaypalService {
    public boolean sendPayment(String user, double amount) {
        System.out.println("PayPal payment for " + user + " amount: " + amount);
        return true;
    }
}
