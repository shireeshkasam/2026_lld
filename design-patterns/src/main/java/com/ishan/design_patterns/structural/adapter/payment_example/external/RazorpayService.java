package com.ishan.design_patterns.structural.adapter.payment_example.external;

public class RazorpayService {
    public int process(double amount, String user) {
        System.out.println("Razorpay payment for " + user + " amount: " + amount);
        return 1;
    }
}
