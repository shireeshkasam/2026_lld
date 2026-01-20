package com.ishan.design_patterns.structural.adapter.payment_example;

public class PaymentRequest {
    private final String userId;
    private final double amount;

    public PaymentRequest(String userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }
}
