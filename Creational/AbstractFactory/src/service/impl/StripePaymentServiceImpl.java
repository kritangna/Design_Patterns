package service.impl;

import service.PaymentService;

public class StripePaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment(Double amount) {
        System.out.println("Stripe Payment Service, making a payment of amount: " + amount);
    }
}
