package com.ishan.design_patterns.structural.adapter.payment_example.external;

public class StripeService {
    public String makeStripePayment(String user, double amount) {
        System.out.println("Stripe payment for " + user + " amount: " + amount);
        return "STRIPE_TXN_SUCCESS";
    }
}