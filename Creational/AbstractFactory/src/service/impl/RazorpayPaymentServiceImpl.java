package service.impl;

import service.PaymentService;

public class RazorpayPaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment(Double amount) {
        System.out.println("Razorpay Payment Service, making payment of amount: " + amount);
    }
}
