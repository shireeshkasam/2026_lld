package com.ishan.design_patterns.structural.adapter.payment_example;

import com.ishan.design_patterns.structural.adapter.payment_example.external.PaypalService;

public class PaypalAdapter implements PaymentAdapter {

    private final PaypalService paypalService = new PaypalService();

    @Override
    public boolean pay(PaymentRequest request) {
        return paypalService.sendPayment(request.getUserId(), request.getAmount());
    }
}
