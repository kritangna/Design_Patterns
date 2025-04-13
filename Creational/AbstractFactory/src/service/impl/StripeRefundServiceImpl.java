package service.impl;

import service.RefundService;

public class StripeRefundServiceImpl implements RefundService {
    @Override
    public void makeRefund(Double amount) {
        System.out.println("Stripe Refund Service, making a refund of amount: " + amount);
    }
}
