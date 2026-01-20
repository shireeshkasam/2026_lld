package com.ishan.design_patterns.structural.adapter.payment_example;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentAdapter processor =
                new StripeAdapter(); // can swap with PayPal/Razorpay easily

        boolean result =
                processor.pay(new PaymentRequest("user123", 1200));

        System.out.println("Payment status: " + result);
    }
}
