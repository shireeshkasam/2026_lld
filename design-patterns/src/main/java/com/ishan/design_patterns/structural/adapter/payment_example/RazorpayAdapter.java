package com.ishan.design_patterns.structural.adapter.payment_example;

import com.ishan.design_patterns.structural.adapter.payment_example.external.RazorpayService;

public class RazorpayAdapter implements PaymentAdapter {

    private final RazorpayService razorpayService = new RazorpayService();

    @Override
    public boolean pay(PaymentRequest request) {
        return razorpayService.process(request.getAmount(), request.getUserId()) == 1;
    }
}
