package com.ishan.design_patterns.structural.adapter.payment_example;

import com.ishan.design_patterns.structural.adapter.payment_example.external.StripeService;

public class StripeAdapter implements PaymentAdapter {

    private final StripeService stripeService = new StripeService();

    @Override
    public boolean pay(PaymentRequest request) {
        String result = stripeService.makeStripePayment(
                request.getUserId(), request.getAmount());
        return result != null;
    }
}
