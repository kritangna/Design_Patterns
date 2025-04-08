package service.impl;

import config.RazorpayClient;
import service.PaymentService;

import java.math.BigDecimal;

public class PaymentServiceImpl implements PaymentService {

    private final RazorpayClient client;

    public PaymentServiceImpl() {
        this.client = RazorpayClient.getInstance();
    }

    @Override
    public void makePayment(BigDecimal amount) {
        client.initiatePayment(amount);
    }
}
