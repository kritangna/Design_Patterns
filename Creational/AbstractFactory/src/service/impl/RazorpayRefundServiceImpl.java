package service.impl;

import service.RefundService;

public class RazorpayRefundServiceImpl implements RefundService {
    @Override
    public void makeRefund(Double amount) {
        System.out.println("Razorpay Refund Service, making a refund of amount: " + amount);
    }
}
